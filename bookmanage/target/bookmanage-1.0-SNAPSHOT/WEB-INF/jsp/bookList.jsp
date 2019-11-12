<%--
  Created by IntelliJ IDEA.
  User: ZHOU
  Date: 2019/10/19
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>图书详细列表</title>
</head>
<body>
<div>
    <p style="font-size: 25px"><c:if test="${userType==0}">普通用户</c:if><c:if test="${userType==1}">图书系统管理员</c:if> 欢迎您！</p>
    <table border="1px" id="tab">
        <tr><td colspan="8" align="center" style="font-size: 25px;background-color: lightyellow">图书详细信息列表</td></tr>
        <tr><th>书名</th><th>作者</th><th>出版社</th><th>出版日期</th><th>页数</th><th>价格</th><th>内容摘要</th><th>操作</th></tr>
        <c:forEach items="${list}" var="list">
            <tr class="tr">
                <td>${list.name}</td>
                <td>${list.author}</td>
                <td>${list.publish}</td>
                <td>
                 <%-- ${list.publishDate}--%>
                </td>
                <td>${list.page}</td>
                <td>${list.price}</td>
                <td>${list.content}</td>
                <td>
                    <a href="" >修改</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="/user/delete?id=${list.id}" >删除</a>
                </td>
            </tr>
        </c:forEach>

    </table>


</div>

</body>
</html>
