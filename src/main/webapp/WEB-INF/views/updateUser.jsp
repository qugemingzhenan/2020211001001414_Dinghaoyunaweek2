<%--
  Created by IntelliJ IDEA.
  User: dinhaoyuan
  Date: 2022/4/20
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Update</h1>
<%
    User u = (User) session.getAttribute("user");
%>
<form action="updateUser" method="post">
    <table align="center">
        <tr>
            <td>id:</td>
            <td><input type="hidden" name="id" value="<%=u.getId()%>" ></td>
        </tr>
        <tr>
            <td>UserName:</td>
            <td><input type="text" name=username autofocus="autofocus" value="<%=u.getUsername()%>"></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name=password value="<%=u.getPassword()%>"></td>
        </tr>
        <tr>
            <td>E-mail</td>
            <td><input type="text" value="please write your email here" name="<%=u.getEmail()%>"></td>
        </tr>
        <tr>
            <td>gender</td>
            <td>
                <input type="radio" name="<%=u.getMale()%>">male <input type="radio" name="<%=u.getFemale()%>">female
            </td>
        </tr>
        <tr>
            <td>Birthday:</td>
            <td><input type="text" name="<%=u.getBirthday()%>"></td>
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


<%@include file="footer.jsp"%>
