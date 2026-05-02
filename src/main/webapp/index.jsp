<%--
  Created by IntelliJ IDEA.
  User: senio
  Date: 21.04.2026
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Start quest page</title>
</head>
<body>
<h1>Header 1</h1>
<p> Text </p>

<form action="game" method="post">
    <label for="playerName">"Say your name:"</label><br>
    <input type = "text" id="playerName" name="playerName"
           placeholder="Введите ваше имя" required
           value="${sessionScope.playerName != null ? sessionScope.playerName : ''}"> <br><br>
            <button type="submit">Lets's start!</button>
</form>
</body>
</html>
