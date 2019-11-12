package com.jbit.controller;

import com.jbit.pojo.User;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller //设置这个类为控制器类
public class IndexController {
    @RequestMapping("/index")
    public  String index(String name){
        System.out.println("请求内容name:"+name);
        System.out.println("接受到了我们的index请求");
return "index.jsp";
    }
    @RequestMapping("/a")
    public  String aa(@RequestParam(value = "name" ,required=true)String username){
        //@RequestParam(value = "name") 相当于请求当中的?name=??
        //required为必填
        System.out.println("请求内容username:"+username);
        return "index.jsp";
    }
    @RequestMapping("/index2")
    public ModelAndView index2(String name){
        System.out.println("接收到index2的请求了，name:"+name);
        ModelAndView modelAndView=new ModelAndView();
        //把数据带到页面
        modelAndView.addObject("name",name );
        modelAndView.setViewName("index.jsp");
        return  modelAndView;
    }

    //公司一般用index3
    @RequestMapping("/index3")
    public  String index3(String name, Model model){
        //model 把模型当作一个入参
        model.addAttribute("name",name);
        User user= new User("张三", 123);
        //如果说我们传入的参数是没有设置键的话 默认使用对象类型来做键
        model.addAttribute(user);
        model.addAttribute("user1", user);
        return "index";
    }
    @RequestMapping( value = "/index4", method = RequestMethod.POST)
    //method = RequestMethod.POST  设置提交方式 只接收post方式提交 a标签默认get
    //点击修改跳转修改页面使用get方式
    //点击修改的保存 使用post方式
    public  String index4(String name, Map<String,Object> model){
        model.put("name", name);
        return "index";
    }
    @RequestMapping("/index5")
    public  String index5(String name,Map<String,Object> model){
        User user=new User("杜豪", 666);
        model.put("user",user);
        return  "index";
    }
}
