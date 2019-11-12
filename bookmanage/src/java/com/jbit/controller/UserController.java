package com.jbit.controller;

import com.jbit.pojo.User;
import com.jbit.service.book.BookService;
import com.jbit.service.user.UserService;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private BookService bookService;
    @RequestMapping("/login")
    public String login(@RequestParam(value = "name",required = false) String name,
                        @RequestParam(value = "password",required = false)String password,
                        HttpSession session){
        User user = userService.login(name, password);
        if(user!=null){
            List<User> list = bookService.getBookList();
            session.setAttribute("list",list);
        return "bookList";
        }
        return  "index";
    }
    @RequestMapping("/list")
    public String list(HttpSession session){
        List<User> list = bookService.getBookList();
        session.setAttribute("list",list);
        return "bookList";
    }
    @RequestMapping("/delete")
    public String delete(Integer id){
        System.out.println(id);
       boolean fage = bookService.DeleteBook(id);
       if(fage){
           return "redirect:/user/list";
       }
        return "bookList";
    }
}
