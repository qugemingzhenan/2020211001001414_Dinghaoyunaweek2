<%--
  Created by IntelliJ IDEA.
  User: dinhaoyuan
  Date: 2022/5/1
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>week 10 </title>
</head>
<body>
<h2>use of pageContext to set ,get,remove attribute from 4scope:page,request,session,application</h2>
<%
    pageContext.setAttribute("attName","in page");
    request.setAttribute("attName","in request");
    session.setAttribute("attName","in session");
    application.setAttribute("attName","in application");

    pageContext.setAttribute("attName","in application",PageContext.APPLICATION_SCOPE);
%>
<h2>Get attribute using implicit objects - way1</h2>
Att Value : <%=pageContext.getAttribute("attName")%>
Att Value : <%=request.getAttribute("attName")%>
Att Value : <%=session.getAttribute("attName")%>
Att Value : <%=application.getAttribute("attName")%>

<h2>Get attribute using pageContext - way2</h2>
Att Value <%=pageContext.getAttribute("attName",PageContext.PAGE_SCOPE)%>
Att Value <%=pageContext.getAttribute("attName",PageContext.REQUEST_SCOPE)%>
Att Value <%=pageContext.getAttribute("attName",PageContext.SESSION_SCOPE)%>
Att Value <%=pageContext.getAttribute("attName",PageContext.APPLICATION_SCOPE)%>

<h2>use findAttribute of pageContext-search-page=request-application</h2>
Att Value : <%=pageContext.findAttribute("attName")%>(which one ?)
</body>
</html>
