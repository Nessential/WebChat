<%--
  Created by IntelliJ IDEA.
  User: 000
  Date: 2022/3/24
  Time: 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>用户登录</title>
</head>

<body>
<script src="js/cookies.js">
</script>

<form action="/login/newlogin"  method="post" id="myform" >
  <input type="text" id="username" name="username"/>
  <input type="password" id="password" name="password"/>
  <input type="submit" value="提交" id="login" />
</form>

<form action="/logout" method="post">
  <input type="submit" value="注销">
</form>

<br>


<form action="/chat/newchat" method="post" id="form" >
  <input type="text" name="username"/>
  <input type="text" name="value"/>
  <input type="text" name="time">
  <input type="submit"  value="提交" />



</form>

<a href="${pageContext.request.contextPath}/mainchat">goto main</a>
<a href="${pageContext.request.contextPath}register.jsp">注册</a>


<a href="/register"> 迁移注册</a>
<a href="/login">login</a>
</body>

</html>
