package com.example.bajian.tcallbackdemo;

/**
 * 测试泛型接口
 * Created by bajian on 2015/12/4.
 * email 313066164@qq.com
 */
public class TIClass {


    public static  void show(ResultCallback<String> cb){
        double r = Math.random();
        if (r>0.5 ) cb.onSucc("123");
        else cb.onFail(new IllegalArgumentException());
    }

/*    private static <T> void run(ResultCallback<T> cb ,T object){
        cb.onSucc(object);
    }*/
// 因为泛型会被擦除，所以这么写不算重载，会报错的
//    public static void run(ResultCallback<Integer> cb){
//
//        if (Math.random()>0.5) cb.onSucc(123);
//        else
//            cb.onFail(new IllegalArgumentException());
//
//    }

    static interface ResultCallback<T>{
        void onSucc(T response);
        void onFail(Exception e);
    }
}
