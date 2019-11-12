package com.jbit.ref;

import lombok.Data;

@Data
public class Printer {
    /**
     * 纸张和墨盒是有多种情况的 所以我们为了保持我们的灵活度 我们采用面向接口编程
     */
    private  Paper paper;
    private  Ink ink;
    public  void  show(){
        System.out.println("在"+paper.size()+"用："+ink.color()+"打印");
    }
}
