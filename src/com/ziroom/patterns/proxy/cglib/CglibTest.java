package com.ziroom.patterns.proxy.cglib;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Yangjy
 * @version 1.0.0
 * @date 2018-03-15
 */
public class CglibTest {

    public static void main(String[] args) {

        ZhangSan zhangSan = (ZhangSan) new CglibMeiPo().getInstance(ZhangSan.class);
        zhangSan.findLove();

    }
}
