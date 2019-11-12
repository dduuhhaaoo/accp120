package cn.smbms.servlet.user;

import cn.smbms.pojo.AppInfo;
import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;


import cn.smbms.tools.Constants;
import cn.smbms.tools.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    //接收并跳转
    @RequestMapping(value = "/login.html",method = RequestMethod.GET)
public  String dologin(){
        System.out.println("接收请求");
        return "devlogin";
    }
//登陆
    @RequestMapping(value ="/dologin.html",method = RequestMethod.POST)
    public  String dologin1(@RequestParam String devCode,
                            @RequestParam String devPassword,
                            HttpServletRequest request,
                            HttpSession session
                            ){
        System.out.println("devCode:"+devCode);
        System.out.println("devPassword:"+devPassword);
        User user= userService.login(devCode, devPassword);
        if (user!=null){
            session.setAttribute(Constants.USER_SESSION,user);
            return "/developer/main";
        }else {
            request.setAttribute("error", "账号或密码错误");
            return "devlogin";
        }
    }


    //退出
    @RequestMapping(value = "/goout.html",method = RequestMethod.GET)
    public  String goout(){
        System.out.println("aa");
        return  "redirect:/index.jsp";
    }

    //点击app维护跳转查询列表
    @RequestMapping("/userlist.html")
    public  String getUserlist(){
        System.out.println("接收跳转请求！");
       // return "backend/applist";
       return "redirect:/user/mainlist.html";
        //return  "developer/appinfolist";
    }

    @RequestMapping(value = "/mainlist.html")

    public  String getList(Model model){
        List<AppInfo>userList=userService.getInfoList1("机",3, 1, 2, 20, null, 1, 2);
        model.addAttribute("userList",userList);
        return "developer/appinfolist";
    }
//    @RequestMapping("/mainlist.html")
//    public  String getList(Model model,
//                           @RequestParam(value = "querySoftwareName",required = false)String querySoftwareName,//软件名称
//                           @RequestParam(value = "queryStatus",required = false)Integer queryStatus,//APP状态
//                           @RequestParam(value = "queryFlatformId",required = false)Integer queryFlatformId,//所属平台
//                           @RequestParam(value = "queryCategoryLevel1",required = false)Integer queryCategoryLevel1,//一级分类
//                           @RequestParam(value = "queryCategoryLevel2",required = false)Integer queryCategoryLevel2,//二级分类
//                            @RequestParam(value = "queryCategoryLevel3",required = false)Integer queryCategoryLevel3//三级分类
//
//
//    ){
//        querySoftwareName="机";
//        queryStatus=3;
//        queryFlatformId=2;
//        queryCategoryLevel1=2;
//        queryCategoryLevel2=20;
//        queryCategoryLevel3=null;
//
//        List<AppInfo>userList=null;
//
//
//        userList=userService.getInfoList1(querySoftwareName, queryStatus, queryFlatformId, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, 1, 2);
//model.addAttribute("userList",userList);
//
//
//        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
//
//        return "developer/appinfolist";
    //}

}
