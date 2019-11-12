package com.jbit.pojo;

public class Singleton {
    //恶汉模式
    private static  Singleton singleton=new Singleton();

public  static  Singleton getInstance(){
    return  singleton;
}
}
