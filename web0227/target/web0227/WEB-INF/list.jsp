<%@ page import="java.util.List" %>
<%@ page import="com.neuedu.pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: 可惜没如果
  Date: 2019/3/1
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        #tb{
            border: solid 2px blue;
            border-collapse: collapse;
        }
        #tb thead tr th,#tb tbody tr td{
            border: solid 2px blue;
            padding: 15px 5px;
        }
    </style>
</head>

<body>
<a href="add.do">添加</a>
<table id="tb">
    <thead >
    <tr>
        <th>id</th>
        <th>uname</th>
        <th>password</th>
        <th>action</th>
    </tr>

    </thead>
    <tbody>
    <%--el表达式
    搭配使用 jstl 标签库 --%>
<c:forEach items="${ lists}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.uname}</td>
        <td>${user.password}</td>
        <td><a href="update.do?id=${user.id}"> 修改</a>&nbsp;| &nbsp;<a href="delete.do?id=${user.id}">删除</a></td>
    </tr>
</c:forEach>


    </tbody>
</table>

</body>
</html>
