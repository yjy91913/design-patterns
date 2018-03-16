package com.ziroom.patterns.proxy.custom;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Yangjy on 2018/3/16.
 */
public interface YInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException;

}
