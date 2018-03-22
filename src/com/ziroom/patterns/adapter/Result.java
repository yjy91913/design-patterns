package com.ziroom.patterns.adapter;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class Result<T> implements Serializable {

    protected int code;

    protected String message;

    protected T data;

    /* 提供快捷方法 */
    public static <T> Result<T> ok() {
        return Result.<T>builder().code(ResultCode.OK).message("成功").build();
    }

    public static <T> Result<T> ok(String message) {
        return Result.<T>builder().code(ResultCode.OK).message(message).build();
    }

    public static <T> Result<T> ok(T data) {
        return Result.<T>builder().code(ResultCode.OK).message("成功").data(data).build();
    }
    /* 提供快捷方法 */
    public static <T> Result<T> no() {
        return Result.<T>builder().code(ResultCode.NO).message("失败").build();
    }
    public static interface ResultCode {

        int OK = 200;
        int NO = 1;

        int BAD_REQUEST = 400;
        int UNAUTHENTICATED = 401;
        int UNAUTHORIZED = 403;

    }

}


