package com.jbit.pojo;
//懒汉单例模式
public class Singleton2 {
    private  static  Singleton2 singleton=null;
    public  Singleton2(){

    }
    public static   Singleton2 getInstance(){
        if (singleton==null){
            singleton=new Singleton2();
        }
        return  singleton;
    }
}
