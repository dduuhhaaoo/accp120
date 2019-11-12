package org.java.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Map;

@Getter
@Setter
public class Hello extends ActionSupport {
    private  String[] names;
    private Date date;
    public String test(){
        Map<String, Object> session = ActionContext.getContext().getSession();
        session.put("aa", "name...");


        for (String name:names){
            System.out.println("name"+name);
        }
        System.out.println(date);
        return SUCCESS;
    }


}
