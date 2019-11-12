<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<body>
<%--<a href="hello">请求</a>--%>
<%--<h1>${message}</h1>--%>
<%--<s:if test="1==1">真</s:if>--%>

<%--<s:iterator value="names" var="n">--%>
<%--    <s:property value="n"></s:property>--%>
<%--</s:iterator>--%>

<%--<s:iterator begin="1" end="100" step="2" status="i">--%>
<%--<p <s:if test="#i.isOdd">style="background-color: red"</s:if>> <s:property></s:property></p>--%>
<%--</s:iterator>--%>

<%--<s:iterator begin="1" end="100" step="2" status="i">--%>
<%--<p <s:if test="#i.isEven">style="background-color: red"</s:if>> <s:property></s:property></p>--%>
<%--</s:iterator>--%>

<%--<s:iterator begin="1" end="100" status="i">--%>
<%--    <p><s:property value="i"></s:property></p>--%>
<%--</s:iterator>--%>



<form method="post" action="hello">
    <p>用户名：<input type="text" name="names"/></p>
    <p>用户名：<input type="text" name="names"/></p>
    <p>用户名：<input type="text" name="names"/></p>
    <p>时间:<input type="text" name="date"/></p>
    <p><input type="submit" value="登录"/></p>
    <s:set var="myurl" value="'http://www.baidu.com'"></s:set>
    <p>
        <s:url value="%{#myurl}"></s:url>
    </p>
    <p>
        <s:property value="#myurl"></s:property>
    </p>
    <p>
        <s:url value="%{#myurl}">
            <s:param name="id" value="1"></s:param>
            <s:param name="name" value="hello"></s:param>
        </s:url>
    </p>
</form>
</body>
</html>
