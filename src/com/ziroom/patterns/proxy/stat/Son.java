package com.ziroom.patterns.proxy.stat;


/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Yangjy
 * @version 1.0.0
 * @date 2018-03-15
 */
public class Son implements Person {

    @Override
    public void findLove() {
        System.out.println("相亲");
    }

    @Override
    public void job() {
        System.out.println("干活");
    }

    @Override
    public void buy() {
        System.out.println("购物");
    }
}
