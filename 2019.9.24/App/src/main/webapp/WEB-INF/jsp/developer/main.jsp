<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/developer/common/header.jsp"%>
<div class="page-title">
	<div class="title_left">
		<h3>
			<!--devUserSession     -->
			欢迎你：${userSession.devName }<strong> | 角色：开发者账户</strong>
		<!--	Constants.USER_SESSION -->
		</h3>
	</div>
</div>
<div class="clearfix"></div>
<%@include file="/WEB-INF/jsp/developer/common/footer.jsp"%>
