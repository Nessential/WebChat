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
<form action="${pageContext.request.contextPath}/login" method="post" id="myform">
  <input type="text" id="username" name="username"/>
  <input type="password" id="password" name="password"/>
  <input type="submit" value="提交" id="login" />
</form>
<br>
<form action="${pageContext.request.contextPath}/chat/newchat" method="get" id="form">
  <input type="text" name="name"/>
  <input type="text" name="value"/>
  <input type="text" name="time">
  <input type="submit" value="提交" />
</form>
</body>

</html>
