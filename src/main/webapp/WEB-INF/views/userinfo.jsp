<%@ page import="com.Dinghaoyuan.model.User" %><%--
  Created by IntelliJ IDEA.
  User: dinhaoyuan
  Date: 2022/4/4
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<%
    User user =(User) request.getAttribute("user");
%>
<html>
<head>
    <title>userinfo</title>
</head>
<body>
<table>
    <tr>
        <td>id:</td><td><%=user.getId()%></td>
        <td>username:</td><td><%=user.getUsername()%></td>
        <td>password</td><td><%=user.getPassword()%></td>
        <td>email:</td><td><%=user.getEmail()%></td>
        <td>male:</td><td><%=user.getMale()%></td>
        <td>female:</td><td><%=user.getFemale()%></td>
        <td>birthday:</td><td><%=user.getBirthday()%></td>
    </tr>
</table>

</body>
</html>
<%@include file="footer.jsp"%>
