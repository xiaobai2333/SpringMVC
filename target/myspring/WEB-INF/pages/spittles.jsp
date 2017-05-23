<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hhy
  Date: 2017/5/20
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittles</title>
    <link rel="stylesheet"
            type="text/css">
</head>
<body>
    <h1>test</h1>
    <c:forEach  items="${itemsList}" var="items">
        <li >
            <div class="itemsname">
                <c:out value="${items.name}"/>
            </div>
            <div >
                <span class="itemsprice"><c:out value="${items.price}" /></span>
                <%--<span class="itemsdetail"><c: out value="${items.detail}"  /></span>--%>
            </div>
        </li>
    </c:forEach>
</body>
</html>
