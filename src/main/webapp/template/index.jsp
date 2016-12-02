<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<a href="add">
Add
</a>
<hr/>
<table width="70%" style="border: 1px solid #cccccc">
    <th>标题</th><th>内容</th><th>时间</th><th>操作</th>
    <c:forEach items="${list}" var="list">
    <tr>
        <td>${list['title']}</td>
        <td>${list['content']}</td>
        <td>${list['addtime']}</td>
        <td><a href="delete?id=${list['id']}"> 删除</a> <a href="update?id=${list['id']}">修改</a></td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
