<%--
  Created by IntelliJ IDEA.
  User: dinhaoyuan
  Date: 2022/3/28
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="Login">
    <h4>Login</h4>
    <table>
        <tr>
            <td>username:</td>
            <td><input type="text" name="username" value="${param.username}"></td>
        </tr>
        <tr>
            <td>password:</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="Login"></td>
        </tr>
    </table>
</form>
</body>
</html>
<%@include file="footer.jsp"%>
