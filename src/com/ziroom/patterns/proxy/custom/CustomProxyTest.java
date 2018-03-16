package com.ziroom.patterns.proxy.custom;

import com.ziroom.patterns.proxy.jdk.Man;
import com.ziroom.patterns.proxy.jdk.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Yangjy
 * @version 1.0.0
 * @date 2018-03-15
 */
public class CustomProxyTest {

    public static void main(String[] args) throws IOException {

        Person person = (Person) new CustomMeiPo().getInstance(new Man());
        person.findLove();
        System.out.println(person.getClass());

        byte[] $proxy0s = ProxyGenerator.generateProxyClass("$proxy0", new Class[]{person.getClass()});
        FileOutputStream os = new FileOutputStream("F:\\FM\\$proxy0.class");
        os.write($proxy0s);
        os.flush();
        os.close();

        /**
         * 原理
         * 1.拿到被代理对象的引用,并且获取其接口通过反射获取
         * 2.通过JDK的Proxy类,重新生成新的类,同时实现被代理类所实现的所有接口
         * 3.动态的生成java代码,在Proxy把新加的业务逻辑方法,去调用(在代码中体现)
         * 4.编译新生成的java代码.class
         * 5.再重新加载JVM运行
         *
         * 以上就叫字节码重组
         * JDK有规范 只要是$开头一般都是自动生成
         *
         * 通过反编译可以查看源代码
         */

    }

}
