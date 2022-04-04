<%--
  Created by IntelliJ IDEA.
  User: dinhaoyuan
  Date: 2022/4/4
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<html>
<head>
    <title>userinfo</title>
</head>
<body>
<table>
    <tr>
        <td>id:</td><td><%=request.getAttribute("id")%></td>
        <td>username:</td><td><%=request.getAttribute("username")%></td>
        <td>password</td><td><%=request.getAttribute("password")%></td>
        <td>email:</td><td><%=request.getAttribute("email")%></td>
        <td>male:</td><td><%=request.getAttribute("male")%></td>
        <td>female:</td><td><%=request.getAttribute("female")%></td>
        <td>birthday:</td><td><%=request.getAttribute("birthday")%></td>
    </tr>
</table>

</body>
</html>
<%@include file="footer.jsp"%>
