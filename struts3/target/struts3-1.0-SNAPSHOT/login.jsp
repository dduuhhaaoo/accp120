<%--
  Created by IntelliJ IDEA.
  User: 杜豪
  Date: 2019/11/1
  Time: 12:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--标签库--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function check() {
            alert("aaa");
            var username=document.getElementById("username").value;
            alert(username);
            if (username==""){
                return false;
            }
return  true;
        }
    </script>
</head>
<body>
<form method="post" action="login" onsubmit="return check()">
    <div>
        <s:fielderror fieldName="username"></s:fielderror>
        用户名：<input type="text" name="username" id="username"/><br/><hr/>
        密码：<input type="text" name="password"/><br/><hr/>
        <input type="submit" value="登陆"/>
    </div>
</form>
</body>
</html>
