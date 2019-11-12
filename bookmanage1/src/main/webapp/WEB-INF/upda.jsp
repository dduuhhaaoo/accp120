<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html <%--PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"--%>>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head lang="en">
    <meta charset="UTF-8">
    <title></title>

    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>

    <script type="text/javascript">
        $(function () {
             $("td").attr("colSpan",2);
        })
    </script>
</head>
<body>
<form action="/user/upda.html" method="post">
    <input type="hidden" name="id" id="id" value="${xiu.id}">
    <table cellpadding="1" cellspacing="1"  border="1" align="center">

        <tr>
            <th style="background-color: #FFFFCC" colspan="3">编辑图书</th>
        </tr>
        <tr>
            <th>书名：</th>
            <td colspan="2"><input type="text" name="Name" id="Name" value="${xiu.name}"></td>
        </tr>
        <tr>
            <th>作者：</th>
            <td><input type="text" name="Author" id="Author" value="${xiu.author}"></td>
        </tr>
        <tr>
            <th>出版社：</th>
            <td><input type="text" name="publish" id="publish" value="${xiu.publish}"></td>
        </tr>
        <tr>
            <th>出版日期：</th>
            <td><input type="text" name="publishdate" id="publishdate" value="<fmt:formatDate value="${xiu.publishdate}" pattern="yyyy-MM-dd"/>" >(yyyy-MM-dd)</td>
        </tr>
        <tr>
            <th>页数：</th>
            <td><input type="text" name="Page"  id="Page" value="${xiu.page}"></td>
        </tr>
        <tr>
            <th>价格：</th>
            <td><input type="text" name="Price" id="Price" value="${xiu.price}" ></td>
        </tr>
        <tr>
            <th>内容摘要：</th>
            <td><input type="text" name="Content"  id="Content" value="${xiu.content}"></td>
        </tr>
        <tr>
            <th colspan="3">
                <button type="submit"  name="save">提交</button>
                <button type="button"  name="save" onclick="javascript:history.back(-1)">返回</button>
            </th>
        </tr>

    </table>
</form>
</body>
</html>
