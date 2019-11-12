package com.jbit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

//alt+7
@Data
@AllArgsConstructor //有参构造器
@NoArgsConstructor  //无参构造器
@Component  //注入也是通过set方法
public class User {
    /**
     * 姓名和年龄
     */
    @Value("张三")
    private  String name;
    @Value("16")
    private  int age;
    @Value("三天不打鬼子，手痒痒")
    private  String shuo;

    /**
     * list集合
     * map
     * set
     * 数组
     */
    int []arrays;
    List<Integer>lists;
    Set<String>sets;
    Map<String,String>map;
    Properties properties;
    public  void  show(){
        System.out.println(name+"说"+shuo);
    }
  public  String name(){
       // int a=10/0;
        //方法产生了异常，只是我们的业务流程产生了中断，但是我们的增强并没有受到影响
        return  name;
  }
}

