<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
<form action="/user/add.html" method="post">
    <table cellpadding="1" cellspacing="1"  border="1" align="center">
        <tr>
            <th style="background-color: #FFFFCC" colspan="3">增加图书</th>
        </tr>
        <tr>
            <th>书名：</th>
            <td><input type="text" name="Name" id="Name"></td>
        </tr>
        <tr>
            <th>作者：</th>
            <td><input type="text" name="Author" id="Author" ></td>
        </tr>
        <tr>
            <th>出版社：</th>
            <td><input type="text" name="publish" id="publish"></td>
        </tr>
        <tr>
            <th>出版日期：</th>
            <td><input type="text" name="publishdate" id="publishdate" >(yyyy-MM-dd)</td>

        </tr>
        <tr>
            <th>页数：</th>
            <td><input type="text" name="Page"  id="Page"></td>
        </tr>
        <tr>
            <th>价格：</th>
            <td><input type="text" name="Price" id="Price" ></td>
        </tr>
        <tr>
            <th>内容摘要：</th>
            <td><input type="text" name="Content"  id="Content"></td>
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
