package com.syrigmophonia.glaxy.util;

import java.io.Serializable;


public class ResponseVo<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private String status;
    private String message;
    private T values;

    public static <T> ResponseVo<T> build(String status, String message, T values) {
        return new ResponseVo<T>().setStatus(status).setMessage(message).setData(values);
    }
    
    public static <T> ResponseVo<T> build(String status, String message) {
        return new ResponseVo<T>().setStatus(status).setMessage(message);
    }

    public ResponseVo() {
    }

    public String getStatus() {
        return status;
    }

    public ResponseVo<T> setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseVo<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getValues() {
        return values;
    }

    public ResponseVo<T> setData(T values) {
        this.values = values;
        return this;
    }

    @Override
	public String toString() {
		return "{\"status\":\"" + status + "\",\"message\":\"" + message + "\",\"values\":" + values + "}";
	}
}
