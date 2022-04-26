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
<%
    if(!(request.getAttribute("message")==null)){
        out.print(request.getAttribute("message"));
    }
%>
<%
    Cookie [] allCookies =request.getCookies();
    String username="",password="",rememberMeVale="";
    if(allCookies != null){
        for(Cookie c : allCookies){
            if(c.getName().equals("cUsername")){
                username = c.getValue();
            }
            if(c.getName().equals("cPassword")){
                password = c.getValue();
            }
            if(c.getName().equals("rememberMeVal")){
                rememberMeVale = c.getValue();
            }
        }
    }
%>

<form method="post" action="login">
    <h4>Login</h4>

    <table>
        <tr>
            <td>username:</td>
            <td><input type="text" name="username" value="<%=username%>"></td>
        </tr>
        <tr>
            <td>password:</td>
            <td><input type="text" name="password" value="<%=password%>"></td>
        </tr>
        <tr>
            <td><input type="checkbox" name="rememberMe" value="1" <%=rememberMeVale.equals("1")?"checked":""%>checked>Remember me<br></td>
        </tr>
        <tr>
            <td><input type="submit" name="submit" value="Login"></td>
        </tr>

    </table>
</form>
</body>
</html>
<%@include file="footer.jsp"%>
