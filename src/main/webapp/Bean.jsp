<%@ page import="com.Dinghaoyuan.week10.StringBean" %><%--
  Created by IntelliJ IDEA.
  User: dinhaoyuan
  Date: 2022/5/3
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>week 10</title>
</head>
<body>
    <h1>use java code to access String Bean</h1>
    <jsp:useBean id="bean" class="com.Dinghaoyuan.week10.StringBean"/>
<%
    //com.Dinghaoyuan.week10.StringBean bean = new StringBean();
    //bean.setMessage("hello mr.bean ");
%>
    <jsp:setProperty name="bean" property="message" value='<%=request.getParameter("message")%>'/>
    Message:<%=bean.getMessage()%>

    <h2>use usebean to access StringBean class in jsp</h2>
message(using getProperty) : <jsp:getProperty name="bean" property="message"/>

</body>
</html>
