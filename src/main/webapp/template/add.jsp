<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/11/10
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    tr td{border: 1px solid black;}
</style>
<body>

<form action="doHandler" method="post">
    <input type="text" name="title"/><br/>
    <textarea name="content"></textarea><br/>
    <input name="uname" type="hidden" value="Admin"/>
    <input type="submit" value="submit"/>
</form>


</body>
</html>
