package com.ziroom.patterns.strategy.pay;

import com.ziroom.patterns.strategy.pay.payport.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Yangjy on 2018/3/17.
 */
@Data
@AllArgsConstructor
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public PayState pay(Payment payment){
        return payment.pay(this.uid,this.amount);
    }

}
