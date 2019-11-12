<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 杜豪
  Date: 2019/11/1
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
登陆成功！欢迎你
<s:property value="date"/>
<%--日期格式化--%>
<s:date name="date" format="yyyy-MM-dd"></s:date>
${sessionScope.username}
${sessionScope.aa}
<s:property value="#session.aa"></s:property>
<s:debug></s:debug>
</body>
</html>
