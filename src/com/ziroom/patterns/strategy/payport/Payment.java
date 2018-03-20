package com.ziroom.patterns.strategy.payport;

import com.ziroom.patterns.strategy.PayState;

/**
 * Created by Yangjy on 2018/3/17.
 */
public interface Payment {

    //每增加一个支付渠道,我们就需要维护一次

    /*Payment ALI_PAY = new AliPay();
    Payment WECHAT_PAY = new WeChatPay();
    Payment UNION_PAY = new WeChatPay();*/

    PayState pay(String uid, double amount);

}
