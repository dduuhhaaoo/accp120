package com.jbit.config;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 自定义拦截器
 */
public class TestInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("拦截器开始执行");
        //业务方法执行
      //  String result=actionInvocation.invoke();
        //return result;
        return  "";
    }
}
