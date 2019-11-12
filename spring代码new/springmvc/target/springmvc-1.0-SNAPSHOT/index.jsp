<%--
  Created by IntelliJ IDEA.
  User: 杜豪
  Date: 2019/9/15
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/hello">发送请求</a>
<a href="/index">测试controller类</a>
<a href="/a">模型1</a>
<a href="/index2">模型2</a>
<a href="/index3">模型3</a>
<h1>我们是index2的名字： ${name}</h1>
<h1>我们是index3的名字：${name}</h1>
${msg}
<hr/>
<h1>我们取出对象中的参数${user.name}</h1>
<h1>我们取出对象中的参数${user1.age}</h1
<h1>我们取出对象中的参数${user}</h1>



</body>
</html>
