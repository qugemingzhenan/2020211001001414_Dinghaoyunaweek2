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
    User u =(User) session.getAttribute("user");
%>
<html>
    <title>userinfo</title>
    <%--<%
        Cookie [] allCookies = request.getCookies();
        for(Cookie c : allCookies){
            out.println("<br/>"+c.getName()+"---"+c.getValue());
        }
    %>--%>
<body>
<table>
    <tr>
        <td>id:</td><td><%=u.getId()%></td>
        <td>username:</td><td><%=u.getUsername()%></td>
        <td>password</td><td><%=u.getPassword()%></td>
        <td>email:</td><td><%=u.getEmail()%></td>
        <td>male:</td><td><%=u.getMale()%></td>
        <td>female:</td><td><%=u.getFemale()%></td>
        <td>birthday:</td><td><%=u.getBirthday()%></td>
        <td><a href="updateUser">Update</a></td>
    </tr>
</table>

</body>
</html>
<%@include file="footer.jsp"%>
