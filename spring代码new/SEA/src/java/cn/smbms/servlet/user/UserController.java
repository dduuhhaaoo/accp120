package cn.smbms.servlet.user;

import cn.smbms.pojo.Bill;
import cn.smbms.pojo.Provider;
import cn.smbms.pojo.Role;
import cn.smbms.pojo.User;
import cn.smbms.service.bill.BillService;
import cn.smbms.service.bill.BillServiceImpl;
import cn.smbms.service.provider.ProviderService;
import cn.smbms.service.provider.ProviderServiceImpl;
import cn.smbms.service.role.RoleService;
import cn.smbms.service.role.RoleServiceImpl;
import cn.smbms.service.user.UserService;
import cn.smbms.service.user.UserServiceImpl;
import cn.smbms.tools.Constants;
import cn.smbms.tools.PageSupport;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.mysql.jdbc.StringUtils;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private  BillService billService;
    @Resource
    private  RoleService roleService;
    //接收user登陆的请求
    @RequestMapping(value = "/dologin.html",method = RequestMethod.POST)
    public  String dologin(@RequestParam String userCode,
                           @RequestParam String userPassword,
                           HttpServletRequest request,
                           HttpSession session
                           ){
        System.out.println("userCode:"+userCode);
        System.out.println("userPassword:"+userPassword);

        User user = userService.login(userCode, userPassword);
        if (user!=null){
            session.setAttribute(Constants.USER_SESSION, user);
            return  "redirect:/user/main.html";
        }else {
            request.setAttribute("error", "账号或者密码错误");
            return  "login";
        }
    }
    @RequestMapping(value = "main.html")
    public  String main(){
 return  "frame";
    }

    @RequestMapping("/userlist.html")
    public  String getUserlist(Model model,
                               @RequestParam(value = "queryname",required = false)String queryUserName,
                               @RequestParam(value = "queryUserRole",required = false)String queryUserRole,
                               @RequestParam(value = "pageIndex",required = false)String pageIndex


                               ){
        int _queryUserRole = 0;

        List<User> userList = null;
        //设置页面容量
        int pageSize = Constants.pageSize;
        //当前页码
        int currentPageNo = 1;

        if(queryUserName == null){
            queryUserName = "";
        }
        if(queryUserRole != null && !queryUserRole.equals("")){
                _queryUserRole = Integer.parseInt(queryUserRole);
        }

        if(pageIndex != null){
            try{
                currentPageNo = Integer.valueOf(pageIndex);
            }catch(NumberFormatException e){
              return "redirect:/user/error.html";
            }
        }
        //总数量（表）
        int totalCount	= userService.getUserCount(queryUserName,_queryUserRole);
        //总页数
        PageSupport pages=new PageSupport();
        pages.setCurrentPageNo(currentPageNo);
        pages.setPageSize(pageSize);
        pages.setTotalCount(totalCount);

        int totalPageCount = pages.getTotalPageCount();

        //控制首页和尾页
        if(currentPageNo < 1){
            currentPageNo = 1;
        }else if(currentPageNo > totalPageCount){
            currentPageNo = totalPageCount;
        }


        userList = userService.getUserList(queryUserName,_queryUserRole,currentPageNo, pageSize);
        model.addAttribute("userList", userList);
        List<Role> roleList = null;

        roleList = roleService.getRoleList();
        model.addAttribute("roleList", roleList);
        model.addAttribute("queryUserName", queryUserName);
        model.addAttribute("queryUserRole", queryUserRole);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("totalCount", totalCount);
        model.addAttribute("currentPageNo", currentPageNo);
        return  "userlist";
    }


    //点击新增的时候 跳转新增页面 get
    //新增的时候 保存 post
    @RequestMapping(value = "/addsave.html",method = RequestMethod.GET)
    //相当于传参 @ModelAttribute("user")User user
    public  String addUser(){
        return "useradd";
    }
    @RequestMapping(value = "/addsave.html",method = RequestMethod.POST)
    public  String addUserSava(User user,
                               HttpSession session){
        user.setCreatedBy(((User) session.getAttribute(Constants.USER_SESSION)).getId());
        user.setCreationDate(new Date());
        System.out.println(user.toString());
        if (userService.add(user)){
            return  "redirect:/user/userlist.html";
        }

        return "useradd";
    }
    //修改
    //1.获取ID
    //2.通过id获取用户完整的信息
    //3.提交保存
    @RequestMapping(value = "/modify.html",method = RequestMethod.GET)
public  String modifyById(String uid,Model model){

//接收uid
        System.out.println("===="+uid);
       //通过uid查询到该条用户的详细记录
         User user=   userService.getUserById(uid);
        //把user保存到model当中并且跳转页面
        model.addAttribute(user);
         return "usermodify";
    }
    @RequestMapping(value = "/modify.html",method = RequestMethod.POST)
    public  String modifySave(User user,HttpSession session){
        System.out.println("==============================");
        System.out.println(user.toString());
        user.setModifyBy(((User) session.getAttribute(Constants.USER_SESSION)).getId());
        user.setModifyDate(new Date());
    if (userService.modify(user)){
        return  "redirect:/user/userlist.html";
    }
    return "usermodify";
    }
    //条件查询
    //如果使用的前后端分离 我们使用他比较多
    //将一些不必要内容隐藏起来 但是更安全
    @RequestMapping(value = "/view/{id}",method = RequestMethod.GET)
    public  String view(@PathVariable String id,Model model){
      User user=userService.getUserById(id);
      model.addAttribute(user);
      return "userview";
    }
    @RequestMapping(value = "/deleteUser.html",method = RequestMethod.GET)
    public  String delete(@RequestParam(value = "userid") String id,Model model){
        System.out.println(id);
        if (userService.deleteUserById(Integer.parseInt(id))){
            return "redirect:/user/userlist.html";
        }else {
            return "失败！";
        }


    }
    @RequestMapping(value = "/usexist.html")
    @ResponseBody //专门用于Ajax的调用
    public  Object userExits(@RequestParam String userCode){
        //首先需要返回
        HashMap<String,String>result=new HashMap<String, String>( );
        if (StringUtils.isNullOrEmpty(userCode)){
            //当传入的为空时，判断已存在
            result.put("userCode", "exist");

        }else {
            //将参数带到数据库当中查询
            User user=userService.selectUserCodeExist(userCode);
            if (user!=null){
                result.put("userCode","exist");
            }else {
                result.put("userCode","notexist");
            }
        }
        return JSONArray.toJSONString(result);
    }
    //接下来发送对象
//前台使用ajax发送请求带入一个id
//根据id查询出该数据的详细内容
//返回页面---不能使用el表达式我们需要jquery
    //,produces = {"application/json;charset=UTF-8"}
    //,produces = {"text/html;charset=UTF-8"}
@RequestMapping(value = "/view",method = RequestMethod.GET,produces = {"text/html;charset=UTF-8"})
    @ResponseBody
    public  Object view(@RequestParam String id){
        //后台是否接受请求
    //后台接受数据是否正常
    //保存到数据库当中是否正确
    System.out.println("接收view请求");
    String json="";
    if (id==null ||id==""){
        return "nodata";
    }else {
        User user=userService.getUserById(id);
        //将对象转化为字符串
        json= JSON.toJSONString(user);
    }
    return json;
}
}
