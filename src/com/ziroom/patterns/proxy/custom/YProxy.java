package com.ziroom.patterns.proxy.custom;


import java.lang.reflect.Method;

/**
 * Created by Yangjy on 2018/3/16.
 */
public class YProxy {

    public static String LN = "\r\n";

    public static Object newProxyInstance(YClassLoader classLoader, Class<?>[] interfaces,YInvocationHandler h){

        //1.动态生成源代码.java文件
        generateSrc(interfaces);
        //2.Java文件输出到磁盘

        //3.把生成的.java文件编译成.class文件

        //4.把.class文件加载到JVM

        //5.返回字节码重组以后新的代理对象
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {

        StringBuffer sb = new StringBuffer().append("com.ziroom.patterns.proxy.custom;").append(LN)
                .append("import com.ziroom.patterns.proxy.jdk.Person").append(LN)
                .append("public class $proxy0 implements ").append(interfaces[0].getSimpleName()).append("{").append(LN)
                .append("YInvocationHandler h").append(LN)
                .append("public $proxy0(YInvocationHandler h){").append(LN)
                .append("this.h = h;").append(LN)
                .append("}").append(LN);

        for (Method method : interfaces[0].getMethods()) {
            sb.append("public ").append(method.getReturnType().getName());
        }


        sb.append("}").append(LN)
        ;



        return null;
    }

}
