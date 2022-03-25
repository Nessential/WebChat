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
<%--<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
<script type="text/javascript">
  function go(){
    var json={"username":$("input[name=username]").val(),
      "password":$("input[name=password]").val()};

    var jsonstr=JSON.stringify(json);
    $.ajax({
      type:"post",
      url:"login/newlogin",
      contentType:"application/json;charset=utf-8",
      dataType:"json",
      data:jsonstr,
      success:function(data){
        alert(data.username);
      },
      error:function(){
        alert("失败");
      }
    });
  }
</script>--%>
<body>
<form action="/login/newlogin" method="get" id="myform">
  <input type="text" id="username" name="username"/>
  <input type="password" id="password" name="password"/>
  <input type="submit" value="提交" id="login" />


</form>
<br>
<form action="/chat/newchat" method="get" id="form">
  <input type="text" name="username"/>
  <input type="text" name="value"/>
  <input type="text" name="time">
  <input type="submit"  value="提交" />


</form>

<a href="${pageContext.request.contextPath}/mainchat">goto main</a>
<a href="/WEB-INF/register.jsp"> 注册</a>
</body>

</html>
