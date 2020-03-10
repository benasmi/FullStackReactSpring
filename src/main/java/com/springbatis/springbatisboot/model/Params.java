package com.springbatis.springbatisboot.model;


public class Params<T> {
    private T params;

    public Params(T data) {
        params = data;
    }

    public T getData() {
        return params;
    }

    public void setData(T data) {
        params = data;
    }
}
