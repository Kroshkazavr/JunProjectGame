<%--
  Created by IntelliJ IDEA.
  User: crystl
  Date: 9/20/19
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JUN PROJECT GAME</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>

<div class="w3-container w3-center">
    <div class="w3-bar w3-padding-large w3-padding-24">
        <form method="post" action="/account" class="w3-selection w3-light-grey w3-padding">
            <label>ВВЕДИТЕ ВАШЕ ИМЯ:
                <input type="text" name="name" class="w3-input w3-animate-input w3-border w3-round-large"
                       style="width: 30%"><br/>
            </label>
            <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">ОК</button>
        </form>
    </div>
</div>
</body>
</html>
