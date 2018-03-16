package com.ziroom.patterns.proxy.custom;

import com.ziroom.patterns.proxy.jdk.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 描述:
 * 动态代理,媒婆
 *
 * @author Yangjy
 * @version 1.0.0
 * @date 2018-03-15
 */
public class CustomMeiPo implements YInvocationHandler{

    private Person target;

    public Object getInstance(Person target){
        this.target = target;
        Class clazz = target.getClass();
        return YProxy.newProxyInstance(new YClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {

        if("findLove".equalsIgnoreCase(method.getName())){
            System.out.println("我是媒婆,我要给你找对象");
            Object invoke = method.invoke(this.target, args);
            System.out.println("如果合适就准备办事.");
            return invoke;
        }else {
            Object invoke = method.invoke(this.target, args);
            return invoke;
        }

    }
}
