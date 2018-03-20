package com.ziroom.patterns.factory.sample;

import com.ziroom.patterns.factory.Milk;
import com.ziroom.patterns.factory.TeLunSu;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author Administrator
 * @version 1.0.0
 * @create 2018-03-14 16:56
 */
public class Test {

    public static void main(String[] args) {

        System.out.println(new TeLunSu().getName());
        //小作坊式生产模式,用户不在关系,把生产过程隐藏了
        System.out.println(new SampleFactory().getMilk("特仑苏").getName());
    }
}
