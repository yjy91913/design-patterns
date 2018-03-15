package com.ziroom.patterns.factory.func;

import com.ziroom.patterns.factory.Milk;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Administrator
 * @version 1.0.0
 * @create 2018-03-14 18:12
 */
public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new MengLiuFactory();
        Milk milk = factory.getMilk();
    }
}
