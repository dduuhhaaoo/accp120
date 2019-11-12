<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<style>
    * {
        text-align: center;
    }
</style>
<html>
<body>
<form action="/user/login" method="post" id="form">
    <h2>登录图书管理系统</h2>
    用户名：<input name="name" type="text"><br>
    密&nbsp&nbsp&nbsp&nbsp码：<input name="password" type="text"><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
