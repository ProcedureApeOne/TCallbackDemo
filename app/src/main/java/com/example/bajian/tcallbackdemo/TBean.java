package com.example.bajian.tcallbackdemo;

/**
 * Created by bajian on 2015/12/4.
 * email 313066164@qq.com
 */
public class TBean<T> {
    private T t;

    public TBean(T t){
        this.t=t;
    }

    public T getT() {
        return t;
    }

    public void setT(T mT) {
        t = mT;
    }
}
