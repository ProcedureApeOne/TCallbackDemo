package com.example.bajian.tcallbackdemo;

/**
 * Created by bajian on 2015/12/4.
 * email 313066164@qq.com
 */
//Gen<T, K extends Comparable<? super Double>>的话，就限制了K只能是Double
public class Gen<T, K extends Comparable> {

    private T t;
    private K k;

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public Gen(T t) {
        this.t = t;
    }

    public Gen(T t, K k) {
        this.t = t;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}