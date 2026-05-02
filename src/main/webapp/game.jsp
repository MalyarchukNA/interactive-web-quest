<%--
  Created by IntelliJ IDEA.
  User: senio
  Date: 02.05.2026
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Game</title>
</head>
<body>
<h1>Hello, ${sessionScope.playerName}!</h1>
<p>

</p>

<div>
    <p>ID сессии: ${pageContext.session.id}</p>
    <p>Текущий шаг: ${step}</p>
</div>

</body>
</html>
