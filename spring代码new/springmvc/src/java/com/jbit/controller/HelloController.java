package com.jbit.controller;


import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setAttribute("msg", "学框架就学springmvc");
        System.out.println("接受到请求");
        //在springmvc当中 我们所有的返回都是 ModelAndView
        return  new ModelAndView("index.jsp");
    }
}
