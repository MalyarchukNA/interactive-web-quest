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
    <style>
        .common-text {
            text-align: justify;
            line-height: 1.6;
            max-width: 600px;
        }
    </style>

    <title>Отель "Забвение"</title>
</head>
<body>
<h1>Hello, ${sessionScope.playerName}!</h1>

<c:if test="${not empty step.prevText}" >
    <p class="common-text">
        ${step.prevText}<br><br>
    </p>
</c:if>

<p class="common-text">
    ${step.text}
</p>


<form action="game" method="post">
    <p> Ваш вариант: </p>

    <input type="hidden" id="nextStepText" name="nextStepText" value="">
    <input type="radio" id="choice1" name="step" value="${step.nextStep1id}"
            data-text = "${step.nextStepText1id}" onclick="updateText(this)" required>
    <label for="choice1">${step.option1}</label><br>

    <input type="radio" id="choice2" name="step" value="${step.nextStep2id}"
           data-text = "${step.nextStepText2id}" onclick="updateText(this)" required>
    <label for="choice2">${step.option2}</label><br><br>

    <button type ="submit">Подтвердить выбор</button>

</form>

<script>
    function updateText(radio) {
        document.getElementById('nextStepText').value = radio.getAttribute('data-text');
    }
</script>

<div>
    <p>ID сессии: ${pageContext.session.id}</p>
    <p>Текущий шаг: ${step.id}</p>
</div>


</body>
</html>
