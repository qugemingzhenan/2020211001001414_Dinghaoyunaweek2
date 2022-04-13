<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Welcome to my page!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/>
<a href="exercise1">exercise1-week2</a>
<br/>
<a href="register.jsp">register-getparameter-week3</a>
<br/>
<a href="config">config parameter week4</a>
<br/>
<a href="register.jsp">register jdbc week4</a>
<br/>
<a href="Select_1">Select week5</a>
<br>
<a href="index.jsp">include week5</a>
<br/>
<a href="login.jsp">login week5</a>
<h2>welcome to my online shop home page</h2>
<form method="get" target="_blank" action="search">
    <input type="text" name="txt" size="30">
    <select name="search">
        <option value="baidu">Baidu</option>
        <option value="bing">bing</option>
        <option value="google">google</option>
    </select>
    <input type="submit" value="Search">
</form>
</body>
</html>
<%@include file="footer.jsp"%>