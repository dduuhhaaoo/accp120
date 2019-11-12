package com.jbit;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
    public  String test(){
        System.out.println("执行业务功能");
        return  SUCCESS;
    }
}
