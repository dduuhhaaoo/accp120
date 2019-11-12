package cn.book.controller;

import cn.book.pojo.Book;
import cn.book.pojo.User;
import cn.book.service.book.BookService;
import cn.book.service.user.UserService;
import cn.book.tools.Constants;
import cn.book.tools.PageSupport;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @Resource
    private BookService bookService;


    @RequestMapping(value = "/cha.html")
    public String cha(Model model, @RequestParam(value = "pageIndex",required =false ) String pageIndex
    ){

        //设置页面容量
        int pageSize = Constants.pageSize;
        //当前页码
        int currentPageNo = 1;

        System.out.println(pageIndex+"index");

        if(pageIndex != null){
            try{
                currentPageNo = Integer.valueOf(pageIndex);
                System.out.println("dy"+currentPageNo);
            }catch(NumberFormatException e){
                return "";
            }
        }
        //总数量（表）
        Integer totalCount =bookService.bookye();
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

        Integer dangqian=(currentPageNo-1)*pageSize;

        List<Book> booklist = bookService.getBookList(dangqian,pageSize);

        model.addAttribute("booklist",booklist);

        model.addAttribute("pages",pages);
        model.addAttribute("pageSize",pageSize);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("totalCount", totalCount);
        model.addAttribute("currentPageNo", currentPageNo);

        return "ShowBooks";
    }

    @RequestMapping(value = "/login.html",method = RequestMethod.POST)
    public String loginden(Model model,
                           @RequestParam(value = "name",required =false )String name,
                           @RequestParam(value = "Password",required =false )String Password,
                           HttpSession session,
                           HttpServletRequest request,@RequestParam(value = "pageIndex",required =false ) String pageIndex
    ){
        //设置页面容量
        int pageSize = Constants.pageSize;
        //当前页码
        int currentPageNo = 1;

        System.out.println(pageIndex+"index");

        if(pageIndex != null){
            try{
                currentPageNo = Integer.valueOf(pageIndex);
                System.out.println("dy"+currentPageNo);
            }catch(NumberFormatException e){
                return "redircet:/bill/inroominfo.html";
            }
        }
        //总数量（表）
        Integer totalCount =bookService.bookye();
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

        Integer dangqian=(currentPageNo-1)*pageSize;

        User userlist = userService.userlist(name, Password);
        List<Book> booklist = bookService.getBookList(dangqian,pageSize);

        System.out.println(userlist);
        if (userlist!=null){
            model.addAttribute("booklist",booklist);
            session.setAttribute("userlist",userlist);

            model.addAttribute("pages",pages);
            model.addAttribute("pageSize",pageSize);
            model.addAttribute("totalPageCount", totalPageCount);
            model.addAttribute("totalCount", totalCount);
            model.addAttribute("currentPageNo", currentPageNo);
            model.addAttribute("name",name);

            return "redirect:/user/cha.html";
        }else {
            request.setAttribute("error","用户名或密码错误！");
            return "login";
        }
        /*User user = userService.userlist(name, Password);
        if(user!=null){
            return "redirect:/user/cha.html";
        }
        return "login";*/
    }


    @RequestMapping(value = "/add.html",method = RequestMethod.GET)
    public String add(){
        return "add";
    }

    @RequestMapping(value = "/add.html",method = RequestMethod.POST)
    public String addlist(@RequestParam(value = "name",required =false ) String name,
                          @RequestParam(value = "Author",required =false ) String Author,
                          Book book,Model model
    ){
        System.out.println(book.toString());
        Integer addlist = bookService.addlist(book);
        if (addlist>0){

            System.out.println("成功");
            return "add";
        }
        System.out.println("失败");
        return "add";
    }

    @RequestMapping(value = "/upda.html",method = RequestMethod.GET)
    public String upda(@RequestParam(value = "id",required =false ) Integer id,Model model
    ){
        /*System.out.println(id);
        model.addAttribute("id",id);*/
        Book xiu = bookService.xiu(id);
        model.addAttribute("xiu",xiu);
        return "upda";
    }

    @RequestMapping(value = "/upda.html",method = RequestMethod.POST)
    public String updall(Book book){
        System.out.println(book.toString());
        Integer addlist = bookService.upda(book);
        if (addlist>0){

            System.out.println("成功");
            return "redirect:/user/cha.html";
        }
        System.out.println("失败");
        return "upda";
    }


    //刪除
    @RequestMapping(value = "/deleteInfo.json",method =RequestMethod.GET)
    @ResponseBody
    public Object deleteInfo(@RequestParam(value = "sid",required = false) String sid){
        HashMap<String,String> resultMap=new HashMap<String, String>();
        System.out.println(sid);
        System.out.println("进入删除");
        Integer id=Integer.parseInt(sid);
        Integer deshow = bookService.dele(id);
        if (deshow>0){
            resultMap.put("boo","true");
        }else {
            resultMap.put("boo","false");
        }

        return JSONArray.toJSONString(resultMap);
    }
}
