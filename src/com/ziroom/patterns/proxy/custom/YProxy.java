package com.ziroom.patterns.proxy.custom;


import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Yangjy on 2018/3/16.
 * 手写实现JDK Proxy类 动态代理
 */
public class YProxy {

    public static String LN = "\r\n";

    public static Object newProxyInstance(YClassLoader classLoader, Class<?>[] interfaces,YInvocationHandler h) {
        try {
            //1.动态生成源代码.java文件
            String src = generateSrc(interfaces);
            //2.Java文件输出到磁盘
            String filePath = YProxy.class.getResource("").getPath();
            System.out.println(filePath);
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();
            //3.把生成的.java文件编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manage = compiler.getStandardFileManager(null,null,null);
            Iterable iterable = manage.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null,manage,null,null,null,iterable);
            task.call();
            manage.close();
            //4.把.class文件加载到JVM
            Class proxyClass =  classLoader.findClass("$Proxy0");
            Constructor c  = proxyClass.getConstructor(YInvocationHandler.class);
            f.delete();
            //5.返回字节码重组以后新的代理对象
            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {

        StringBuffer sb = new StringBuffer().append("package com.ziroom.patterns.proxy.custom;").append(LN)
                .append("import com.ziroom.patterns.proxy.jdk.Person;").append(LN)
                .append("import java.lang.reflect.Method;" + LN)
                .append("public class $Proxy0 implements ").append(interfaces[0].getSimpleName()).append("{").append(LN)
                .append("YInvocationHandler h;").append(LN)
                .append("public $Proxy0(YInvocationHandler h){").append(LN)
                .append("this.h = h;").append(LN)
                .append("}").append(LN);


        for (Method m : interfaces[0].getMethods()){
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + LN);
                sb.append("try{" + LN);
                    sb.append("Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\",new Class[]{});" + LN);
                    sb.append("this.h.invoke(this,m,null);" + LN);
                sb.append("}catch(Throwable e){" + LN);
                    sb.append("e.printStackTrace();" + LN);
                sb.append("}");
            sb.append("}");
        }


        sb.append("}").append(LN);
        return sb.toString();
    }

}
