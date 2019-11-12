package org.java.action;

import com.opensymphony.xwork2.Action;

import java.util.Arrays;
import java.util.List;

public class HelloAction implements Action {
    private  String message;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    private List<String>names;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public  String execute(){
        message="hello word!!!";
        names= Arrays.asList("张三","李四","王五");
        return "ok";
    }
    public  String show(){
        System.out.println("=======进入show");
        return  "ok";
    }
    public  String test(){
        System.out.println("========进入test");
        return  "success";
    }

}
