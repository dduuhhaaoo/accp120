<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html <%--PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"--%>>
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>

	<script type="text/javascript">

        function page_nav(frm,num){
            frm.pageIndex.value = num;
            frm.submit();
        }
        $(function () {


			$("#shan").click(function () {
				var path = document.getElementById("path").value;
				var truthBeTold = window.confirm("确定要删除吗？");
				var id=$("#zhi").val()
				if (truthBeTold) {
					alert("jin");
					$.ajax({
						type: "GET",
						url: path+"/user/deleteInfo.json",
						data: {sid: id},
						dataType: "json",
						success: function (data) {
							if (data.boo == "true") {
								alert("刪除成功！")
							} else {
								alert("删除失败！")
							}
							window.location.href = '/user/cha.html';
						},
						error: function (data) {
							alert(data)
							window.location.href = '/user/cha.html';
						}

					});
				}
			})

		})




    </script>

</head>
<body>
<input type="hidden" id="path" value="${requestScope.request.contextPath}">
<h1>${userlist.nickname}欢迎您！</h1>
<div class="div" align="center">
    <form action="/user/cha.html" method="post">
    <input type="hidden" name="pageIndex" value="1">
		<table cellpadding="1" cellspacing="1" class="admin-list" border="1">
		<thead>
			</thead>
			<thead  class="admin-list-head">
			<tr>
				<td align="center" height="10px" colspan="8" style="background-color: #FFFFCC"><span >图书详细信息列表:</span></td>
			</tr>
				<tr>
					<th width="10%">书名</th>
					<th width="10%">作者</th>
					<th width="20%">出版社</th>
					<th width="10%">出版日期</th>
					<th width="20%">页数</th>
					<th width="10%">价格</th>
					<th width="10%">内容摘要</th>
					<th width="10%">操作</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${booklist}" var="stu" varStatus="status">
			<tr <c:if test="${status.index%2==0}">style="background-color:#DDA0DD " </c:if>
				<c:if test="${status.index%2==1}">style="background-color:#FFFFFF " </c:if>
			>
			<td>${stu.name }</td>
					<td>${stu.author }</td>
					<td>${stu.publish }</td>
					<td><%--${stu.publishdate }--%>
						<span>
                       <fmt:formatDate value="${stu.publishdate }" pattern="yyyy-MM-dd "/>
                   </span>
					</td>
					<td>${stu.page }</td>
					<td>${stu.price }</td>
					<td>${stu.content }</td>
					<td><a href="/user/upda.html?id=${stu.id}">修改</a>

                        <a href="javascript:void(0);" id="shan" ><input type="hidden" id="zhi" value="${stu.id }">删除</a>
					</td>
				</tr>
			</c:forEach>
			</tbody>
			<tfoot class="admin-list-foot">
			<tr>
			<td colspan="8">
                <button type="button" onclick="javascript:window.location.href = '/user/add.html';">新增图书信息</button>
                <i>共${totalCount}条记录每页</i>
                <input width="20px" value="${pageSize}">条
                <i>第${currentPageNo }页/共${totalPageCount }页</i>
                <i><a href="javascript:page_nav(document.forms[0],1);">第一页</a></i>
                <i><a href="javascript:page_nav(document.forms[0],${currentPageNo-1 });">上一页</a></i>
                <i><a href="javascript:page_nav(document.forms[0],${currentPageNo+1 });">下一页</a></i>
                <i><a href="javascript:page_nav(document.forms[0],${totalPageCount});">最后一页</a></i>
                <i>转到第</i>
                <input width="20px">页
                <button>go</button>
            </td>
			</tr>
			</tfoot>
		</table>
    </form>


</div>
</body>
</html>