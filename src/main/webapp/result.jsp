<%--
  Created by IntelliJ IDEA.
  User: senio
  Date: 01.05.2026
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <style>
        .common-text {
            text-align: justify;
            line-height: 1.6;
            max-width: 600px;
        }
    </style>
    <title>RESULT</title>
</head>
<body>
<c:if test="${not empty step.prevText}" >
    <p class="common-text">
            ${step.prevText}<br><br>
    </p>
</c:if>

<p class = "common-text" >
    ${stepText}<br>
</p>

<form action="restart" method="post">
    <button type="submit">Начать новую игру</button>
</form>


<div>
    <p>ID сессии: ${pageContext.session.id}</p>
    <p>Текущий шаг: ${step.id}</p>
    <p>Осколки памяти: ${sessionScope.fragments}</p>
    <p>Разум: ${sessionScope.lucidity}</p>
</div>

</body>
</html>
