<%--
  Created by IntelliJ IDEA.
  User: dinhaoyuan
  Date: 2022/5/30
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="CalServlet">
<table>
    <tr>
        <td>First Val:</td>
        <td><input type="text" name="firstval" value="${requestScope.firstval}"></td>
    </tr>
    <tr>
        <td>Second Val:</td>
        <td><input type="text" name="secondval"></td>
    </tr>
    <tr>
        <td>Enter a name:</td>
        <td><input type="text" name="name"></td>
    </tr>
    <tr>
        <td>Length:</td>
        <td><input type="text" name="length"></td>
    </tr>
    <tr>
        <td>Result:</td>
        <td><input type="text" name="result" value="${requestScope.answer}"></td>
    </tr>
    <tr>
        <td><input type="radio" name="action" value="1">add</td>
        <td><input type="radio" name="action" value="2">subs</td>
        <td><input type="radio" name="action" value="3">mut</td>
        <td><input type="radio" name="action" value="4">div</td>
        <td><input type="hidden" name="action" value="Compute Length"></td>
        <td><input type="submit" value="submit"></td>
        <td><input type="reset" name="Reset" value="reset"></td>
    </tr>
</table>
</form>
</body>
</html>
