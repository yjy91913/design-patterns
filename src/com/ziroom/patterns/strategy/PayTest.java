package com.ziroom.patterns.strategy;

import com.ziroom.patterns.strategy.payport.PayType;

/**
 * Created by Yangjy on 2018/3/17.
 */
public class PayTest {

    public static void main(String[] args) {
        //把商品添加到购物车,再从购物车下单
        //直接从订单开始
        Order order = new Order("1", "201803110009", 10.20);

        //开始支付,微信支付 支付宝
        //每个支付渠道的算法是不一样的
        //但基本算法是固定的
        PayState pay = order.pay(PayType.ALIPay.get());
        System.out.println(pay);

    }
}
