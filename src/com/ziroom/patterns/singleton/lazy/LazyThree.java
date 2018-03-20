package com.ziroom.patterns.singleton.lazy;

/**
 * 描述:
 *
 * 懒汉式单例
 *
 * 在外部需要使用的时候才实例化
 * 内部类,只有在外部类调用的时候,才会被加载
 * 内部类需要在方法调用之前初始化
 * 巧妙的避免了线程安全问题
 *
 * 这种形式兼顾了饿汉式内存问题,也兼顾了懒汉式synchronized的性能问题
 * 史上最牛逼单例模式实现方式
 *
 * @author Yangjy
 * @version 1.0.0
 * @date 2018-03-16
 */
public class LazyThree {


    private static LazyThree lazy;

    private LazyThree(){}

    /**
     * static 保证单例空间共享
     * final标示不会被重写 重载
     * @return
     */
    public static final synchronized LazyThree getNewInstance(){
        //在返回结果以前一定会先加载内部类
        return LazyHolder.lazy;
    }


    public static class LazyHolder{
        private static final LazyThree lazy = new LazyThree();
    }
}
