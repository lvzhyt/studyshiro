<%--
  Created by IntelliJ IDEA.
  User: lzh
  Date: 2017/9/25
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>guest</title>
</head>
<body>
<shiro:guest>
    <a href="login.jsp">login</a>
</shiro:guest>
<shiro:user>
    Welcome [<shiro:principal/>]，<a href="${pageContext.request.contextPath}/logout">Logout</a>
</shiro:user>
</body>
</html>
