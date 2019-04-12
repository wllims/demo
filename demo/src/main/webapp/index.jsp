<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>展示所有</title>
</head>
<body>
<table>
    <c:forEach var="user" items="${requestScope.list}" varStatus="vt">
        <tr>
            <td>${vt.count}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.sex}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
