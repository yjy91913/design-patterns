package com.ziroom.patterns.singleton.lazy;

/**
 * 描述:
 *
 * 懒汉式单例
 *
 * 在外部需要使用的时候才实例化
 *
 *
 * @author Yangjy
 * @version 1.0.0
 * @date 2018-03-16
 */
public class LazyTwo {

    private LazyTwo(){}

    //静态化,公共内存区域
    private static LazyTwo lazy;

    public static synchronized LazyTwo getNewInstance(){
        //调用之前先判断一下
        if(lazy==null){
            lazy = new LazyTwo();
        }
        return lazy;
    }
}
