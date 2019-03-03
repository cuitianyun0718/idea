<%--
  Created by IntelliJ IDEA.
  User: 可惜没如果
  Date: 2019/3/2
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--${user}--%>
<form method="get" action="doUpdate.do">
    id:<input type="hidden" name="id" value="${user.id}" readonly="readonly">
    用户名：<input type="text" name="uname" value="${user.uname}"/><br>
    密码:<input type="password" name="password" value="${user.password}"/><br>
    <%--Tele:<input type="text" name="tele"/><br>--%>
    <input type="submit" value="update">
</form>
</body>
</html>
