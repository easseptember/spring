<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    tr td{border: 1px solid black;}
</style>
<body>
<c:forEach items="${info}" var="info">
<form action="doUpdate" method="post">
    <input type="text" name="title" value="${info['title']}"/><br/>
    <textarea name="content">${info['content']}</textarea><br/>
    <input name="uname" type="hidden" value="Admin"/>
    <input name="id" type="hidden" value="${info['id']}"/>

    <input type="submit" value="submit"/>
</form>
</c:forEach>

</body>
</html>
