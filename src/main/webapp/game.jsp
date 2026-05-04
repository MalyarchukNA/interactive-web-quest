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

<form action="game" method="post">
    <p> Ваш вариант: ${step.text} </p>

    <input type="radio" id="choice1" name="step" value=${step.nextStep1id}>
    <label for="choice1">${step.option1}</label><br>

    <input type="radio" id="choice1" name="step" value=${step.nextStep2id}>
    <label for="choice2">${step.option2}</label><br><br>

    <button type ="submit">Подтвердить выбор</button>

</form>

<div>
    <p>ID сессии: ${pageContext.session.id}</p>
    <p>Текущий шаг: ${step.id}</p>
</div>


</body>
</html>
