package com.jbit.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class Logger {
    public  void  after(){
        System.out.println("后置增强");
    }
    //切点
    //@Before(value = "execution(* com.jbit.*.*.*(..))")
    public  void  before(){
        System.out.println("前置增强");
    }
    public  void returning(Object obj){
        //若把void改为object则 打印为
        /**
         * 前置增强
         * 高手
         * 后置增强
         */
        System.out.println(obj);
    }
    //这个e和xml当中要一模一样
    public  void  throwing(Exception e){
        System.out.println(e.getMessage());
    }
    //环绕
    public  Object around(ProceedingJoinPoint joinPoint){
        System.out.println("前置增强");
        try {
            Object proceed=   joinPoint.proceed();
            return  proceed;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常抛出："+throwable.getMessage());
        }finally {
            System.out.println("后置增强");
        }
        return  null;
    }
}
