package com.ziroom.patterns.factory.abstr;

import com.ziroom.patterns.factory.Milk;

/**
 * 描述:
 * 抽象工厂 用户的主入口
 *
 * @author Administrator
 * @version 1.0.0
 * @create 2018-03-15 10:03
 */
public abstract class AbstractFactoryTest {

    public static void main(String[] args) {
        MilkFactory milkFactory = new MilkFactory();

        //用户只有选择的权利,保证了代码的健壮性
        Milk mengNiu = milkFactory.getMengNiu();
    }
}
