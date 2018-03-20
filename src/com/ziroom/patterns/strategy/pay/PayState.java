package com.ziroom.patterns.strategy.pay;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * Created by Yangjy on 2018/3/17.
 * 支付完成以后的状态
 */
@AllArgsConstructor
@ToString
public class PayState {

    private int code;
    private Object data;
    private String msg;

}
