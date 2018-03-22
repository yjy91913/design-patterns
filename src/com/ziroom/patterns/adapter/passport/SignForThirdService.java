package com.ziroom.patterns.adapter.passport;

import com.ziroom.patterns.adapter.Result;

/**
 *
 * 稳定的方法就不动了
 * Created by Yangjy on 2018/3/21.
 */
public class SignForThirdService extends SignService {

    public Result loginForQQ(String openId){

        /**
         * 1. openId全局唯一,我们可以把他当成用户名(加长)
         * 2. 密码为null
         * 3. 在原有的系统里面创建一个用户
         * 4. 调用原来的登录方法
         */
        return loginForRegist(openId,null);
    }

    public Result loginForWeChat(String id){
        return null;
    }

    public Result loginForToken(String token){
        //通过Token拿到用户信息
        return null;
    }

    public Result loginForPhone(String phoneNumber,String code){
        return null;
    }

    public Result loginForRegist(String username,String password){
        Result result = super.register(username, password);
        result.getData();
        Result login = super.login(username, password);
        return login;
    }
}
