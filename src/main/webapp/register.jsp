<%--
  Created by IntelliJ IDEA.
  User: dinhaoyuan
  Date: 2022/3/6
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="register" method="post">
    <table align="center">
        <tr>
            <td>id:</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>UserName:</td>
            <td><input type="text" name=username autofocus="autofocus" value="Username"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="text" name=password value="password"></td>
        </tr>
        <tr>
            <td>E-mail</td>
            <td><input type="text" value="please write your email here" name="email"></td>
        </tr>
        <tr>
            <td>gender</td>
            <td>
                <input type="radio" name="male">male <input type="radio" name="female">female
            </td>
        </tr>
        <tr>
            <td>Birthday:</td>
            <td><input type="text" name="birthday"></td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="submit" name="submit">
                <input type="reset" value="reset" name="reset">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
<%@include file="footer.jsp"%>
