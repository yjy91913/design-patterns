package com.ziroom.patterns.singleton.hungry;

/**
 * 描述:
 * 饿汉式
 * 他在加载时候立即初始化,创建单例对象
 *
 * 优点:没有加任何锁 执行效率高
 * 在用户体验上来说 他比懒汉式更好
 * 绝对线程安全 在线程还没出现之前就实例化了 不可能存在不安全的问题
 *
 * 缺点:
 * 不管你用不用我就初始化,占用空间
 * 浪费内存
 *
 * @author Yangjy
 * @version 1.0.0
 * @date 2018-03-16
 */
public class Hungry {

    private Hungry(){}

    public static final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }

}
