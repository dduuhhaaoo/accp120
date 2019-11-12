package org.java.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.Map;
//implements Action
public class LogingAction extends ActionSupport {
    private  String username;
    private  String password;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String execute() throws Exception {
        System.out.println("username==========="+username);
        System.out.println("password==========="+password);
        if ("duhao".equals(username) && "123456".equals(password)){
           //解耦性
//            Map<String, Object> session = ActionContext.getContext().getSession();
//            session.put("username", username);
            //耦合性 需要导入servlet-api包
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("username", username);
            return  "success";
        }else {
            return  "error";
        }






    }

    @Override
    public void validate() {
        System.out.println("进入validate");
        System.out.println("username=========================="+username);
        System.out.println("password========================="+password);
        if (username!="admin"){
            addFieldError("username", "用户名必填");
        }
    }
}
