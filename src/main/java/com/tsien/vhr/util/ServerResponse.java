package com.tsien.vhr.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.tsien.vhr.constant.ResponseCodeEnum;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2019/9/24 0024 9:53
 * 注解 @JsonInclude(JsonInclude.Include.NON_NULL)，保证序列化Json的时候，如果是null对象，key也会消失
 * 注解 @JsonIgnore，使之不在序列化结果当中
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServerResponse<T> implements Serializable {

    private String status;
    private String msg;
    private T data;

    private ServerResponse(String status) {
        this.status = status;
    }

    private ServerResponse(String status, T data) {
        this.status = status;
        this.data = data;
    }

    private ServerResponse(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    private ServerResponse(String status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return Objects.equals(this.status, ResponseCodeEnum.SUCCESS.getStatus());
    }

    public String getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public static <T> ServerResponse<T> createBySuccess() {
        return new ServerResponse<>(ResponseCodeEnum.SUCCESS.getStatus());
    }

    public static <T> ServerResponse<T> createBySuccess(T data) {
        return new ServerResponse<>(ResponseCodeEnum.SUCCESS.getStatus(), data);
    }

    public static <T> ServerResponse<T> createBySuccess(String msg, T data) {
        return new ServerResponse<>(ResponseCodeEnum.SUCCESS.getStatus(), msg, data);
    }

    public static <T> ServerResponse<T> createBySuccessMessage(String msg) {
        return new ServerResponse<>(ResponseCodeEnum.SUCCESS.getStatus(), msg);
    }

    public static <T> ServerResponse<T> createByErrorMessage(String errorMsg) {
        return new ServerResponse<>(ResponseCodeEnum.ERROR.getStatus(), errorMsg);
    }

    public static <T> ServerResponse<T> createByErrorCodeMessage(String errorStatus, String errorMsg) {
        return new ServerResponse<>(errorStatus, errorMsg);
    }

}
