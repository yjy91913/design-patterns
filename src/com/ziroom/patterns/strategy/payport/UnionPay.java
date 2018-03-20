package com.ziroom.patterns.strategy.payport;

import com.ziroom.patterns.strategy.PayState;

/**
 * Created by Yangjy on 2018/3/17.
 */
public class UnionPay implements Payment {
    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用银联支付");
        System.out.println("查询余额,开始从银行卡扣款");
        return new PayState(200,amount,"支付成功");
    }

}
