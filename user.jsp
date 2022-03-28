<%--
  Created by IntelliJ IDEA.
  User: dinhaoyuan
  Date: 2022/3/20
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Select all from usertable</title>
</head>
<body>
<%--//Create a student JSP,
in which the El expression and JSTL tag are used to obtain the attribute data of the request range--%>
<form>
    <table border="1px">
    <tr>
        <th>id</th>
        <th>username</th>
        <th>password</th>
        <th>male</th>
        <th>female</th>
        <th>email</th>
        <th>birthday</th>
    </tr>
    <c:forEach items="${requestScope.users}" var="users">
        <tr>
            <td>${users.id} </td>
            <td>${users.username} </td>
            <td>${users.password} </td>
            <td>${users.male} </td>
            <td>${users.female} </td>
            <td>${users.email} </td>
            <td>${users.birthday} </td>
        </tr>
    </c:forEach>
    </table>
</form>
</body>
</html>
<%@include file=""%>
