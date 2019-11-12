package com.jbit.pojo;

import lombok.Data;

@Data
public class User {
/**
 * 依赖注入：DI
 * 在spring创建对象的时候 就给对象的一些属性值注入一些内容
 */
//alt +insert
    private  String name;
    private  String say;
    public  void  show(){
        System.out.println(name+"说"+say);
    }
    public  void  add(){
        System.out.println("执行新增方法，切点");
    }
    public  String add2(){
      // int a=10/0;
        return "高手";
    }

}

