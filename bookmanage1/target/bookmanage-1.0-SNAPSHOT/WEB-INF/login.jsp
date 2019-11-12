<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link href="css/style.css" rel="stylesheet"/>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>

    <script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="https://jqueryvalidation.org/files/dist/jquery.validate.min.js"></script>
    <script src="https://jqueryvalidation.org/files/dist/additional-methods.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("th").css({"backgroundColor":"#DDA0DD"})
        })


    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login.html" method="post" >
    <table cellpadding="1" cellspacing="0"  border="1" align="center">
        <tr>
            <td colspan="3"  align="center">登入图书管理系统</td>
        </tr>
        <tr>
            <th>用户名：</th>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <th>密码：</th>
            <td><input type="text" name="Password" id="Password"></td>
        </tr>
        <tr>
            <td colspan="3" align="center">
                <button type="submit"  name="save">登入</button>
            </td>
        </tr>
        <tr><td colspan="3" style="color: red">${error}</td></tr>
    </table>
</form>
</body>
</html>
