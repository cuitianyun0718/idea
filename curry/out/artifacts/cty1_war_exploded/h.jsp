<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$</title>
</head>
<body>
<%=pageContext.getAttribute("pageContext") %>
<%=request.getAttribute("request") %>
<%=session.getAttribute("session") %>
<%=application.getAttribute("application") %>
</body>
</html>