package com.xiaosong456.springcloud.entities;

import java.io.Serializable;

/**
 * @author lixiaosong
 * @Description 公共类
 * @ClassName CommonResult
 * @Date 2020/4/29 16:20
 **/
public class CommonResult<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    public CommonResult(){

    }


    public CommonResult(Integer code,String message){
        this.code=code;
        this.message=message;
        this.data = null;
    }

    public CommonResult(Integer code, String message, Object object) {
        this.code=code;
        this.message=message;
        this.data = (T) object;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
