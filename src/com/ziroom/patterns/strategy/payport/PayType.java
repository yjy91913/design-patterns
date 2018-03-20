package com.ziroom.patterns.strategy.payport;

/**
 * Created by Yangjy on 2018/3/17.
 */
public enum PayType {

    ALIPay(new AliPay()),
    WECHAT(new WeChatPay()),
    UNION_PAY(new UnionPay());

    private Payment payment;

    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment get(){
        return this.payment;
    }
}
