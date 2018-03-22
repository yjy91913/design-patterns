package com.ziroom.patterns.adapter.passport;

import com.ziroom.patterns.adapter.Result;
import com.ziroom.patterns.adapter.entity.Member;

/**
 * Created by Yangjy on 2018/3/21.
 */
public class SignService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public Result register(String username,String password){
        return Result.ok(new Member());
    }

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    public Result login(String username,String password){
        return null;
    }

}
