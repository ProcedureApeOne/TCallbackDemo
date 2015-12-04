package com.example.bajian.tcallbackdemo;

/**
 * Created by bajian on 2015/12/4.
 * email 313066164@qq.com
 * 泛型方法的声明，必须在方法的修饰符（public,static,final,abstract等）之后，返回值声明之前。
 * 和泛型类一样，可以声明多个泛型，用逗号隔开。
 */
public class TMethod {

    public static <T> void print(T t){
        System.out.println("t.getClass()"+t.getClass());
    }
    public static <T extends String> void printS(T t){
        System.out.println("T extends String t.getClass():"+t.getClass());
    }
    public static <T,K> void printMulti(T t,K k){
        System.out.println("T extends String t.getClass():"+t.getClass()+"k.getClass"+k.getClass());
    }
}
