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
public class LazyOne {

    private LazyOne(){}

    //静态化,公共内存区域
    private static LazyOne lazy;

    public LazyOne getNewInstance(){
        //调用之前先判断一下
        if(lazy==null){
            lazy = new LazyOne();
        }
        return lazy;
    }
}
