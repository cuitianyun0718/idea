<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$</title>
</head>
<body>
已登录
<%

//java片段
//    System.out.println(request.getAttribute("key"));
    //request内置对象

//    作用于
//    pageContext 只在当前页面
//    request 一次请求
//    session 一次会话
//    servletContext 服务器关闭消失


    pageContext.setAttribute("pageContext","pageContext");
    request.setAttribute("request","request");
    session.setAttribute("session","session");
    application.setAttribute("application","application");

    response.sendRedirect("h.jsp");
//    request.getRequestDispatcher("h.jsp").forward(request,response);
%>
</body>
</html>