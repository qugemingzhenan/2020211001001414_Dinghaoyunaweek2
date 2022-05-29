<%@ page import="com.Dinghaoyuan.week10.StringBean" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/15/2021
  Time: 11:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>validate</title>
</head>
<body>
<%--Todo 1: Use <jsp:useBean> to create a Login bean instance in request scope --%>
    <jsp:useBean id="login" class="com.Dinghaoyuan.week10.StringBean" scope="session"></jsp:useBean>
    <%--Todo 2: Use <jsp:setProperty> to set  beans' property username and password--%>
<%
   //todo 3: use if check username is admin and ppassword is admin
%>
    <%--todo 4: use jsp:forward to welcome.jsp page--%>

    <%--todo 5: else part{ --%>

<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    if("admin".equals(username)&&"admin".equals(password)){
%>
<jsp:setProperty property="username" name="login"></jsp:setProperty>
<jsp:setProperty property="password" name="login"></jsp:setProperty>
<%

        response.sendRedirect("welcome.jsp");
        //request.getRequestDispatcher("/Lab2/welcome.jsp").forward(request,response);
    }else{
        response.sendRedirect("login.jsp");
        //response.sendRedirect(request.getContextPath()+"/Lab2/login.jsp");
    }
%>

    <%--todo 7: use jsp:include login.jsp page --%>

    <%--todo 8: close else --%>

</body>
</html>