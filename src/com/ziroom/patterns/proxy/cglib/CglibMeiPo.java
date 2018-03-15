package com.ziroom.patterns.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Yangjy
 * @version 1.0.0
 * @date 2018-03-15
 */
public class CglibMeiPo implements MethodInterceptor{


    public Object getInstance(Class clazz){
        Enhancer enhancer = new Enhancer();
        //把那个类设置成父类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务增强
        System.out.println("我是媒婆,我要给你找对象");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("如果合适就准备办事");
        return result;
    }
}
