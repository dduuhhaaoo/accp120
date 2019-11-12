package cn.smbms.servlet.user;

import cn.smbms.pojo.User;
import cn.smbms.service.user.UserService;
import cn.smbms.tools.Constants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    //接收user登陆的请求
@RequestMapping(value = "/dologin.html",method = RequestMethod.POST)
    public  String dologin(@RequestParam String userCode,
                           @RequestParam  String userPassword,
                           HttpServletRequest request,
                           HttpSession session
){
    System.out.println("userCode:"+userCode);
    System.out.println("userPassword:"+userPassword);
    User user=new User();
          user=  userService.login(userCode, userPassword);
    if (user!=null){
        session.setAttribute(Constants.USER_SESSION, user);
        return "redirect:/user/main.html";
    }else {
        request.setAttribute("error", "账号或密码错误");
        return "login";
    }
}
@RequestMapping("/main.html")
    public  String main(){
    return "frame";
}
@RequestMapping("/userlist.html")
    public  String getUserlist(Model model,
                               @RequestParam(value = "queryname",required =false) String queryname,
                               @RequestParam(value = "queryUserRole",required = false) String queryUserRole,
                               @RequestParam(value = "pageIndex",required = false) String pageIndex

                               ){
int _queryUserRole=0;
return  "";
}
}
