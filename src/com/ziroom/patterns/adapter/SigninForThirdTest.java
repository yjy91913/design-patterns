package com.ziroom.patterns.adapter;

import com.ziroom.patterns.adapter.passport.SignForThirdService;

/**
 * Created by Yangjy on 2018/3/21.
 */
public class SigninForThirdTest {

    public static void main(String[] args) {

        SignForThirdService service = new SignForThirdService();

        //不改变原来的代码,也要能够兼容新的需求
        //还可以加一层策略模式
        Result result = service.loginForQQ("adsasdaa");


    }

}
