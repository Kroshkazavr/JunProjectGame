<%@ page import="java.util.List" %>
<%@ page import="model.Model" %>
<%@ page import="app.entities.Person" %><%--
  Created by IntelliJ IDEA.
  User: crystl
  Date: 9/20/19
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>ACCOUNT</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

</head>
<body>

<div class="w3-container w3-center">
    <div class="w3-bar w3-padding-large w3-padding-24">
        <ul>
            <%
                out.println("<div class=\"w3-panel w3-red w3-display-container w3-card-4 w3-round \">\n" +
                        "<h6 >Your character <b>" + Model.getInstance().getPlayer1().getName() + "</b> is ready to fight!\n" +
                        "</div>");
            %>
        </ul>

        <form method="get" action="/fight" class="w3-selection  w3-padding">
            <button type="submit" class="w3-btn w3-red w3-display-container w3-card-4 w3-round w3-margin-bottom">В БОЙ
            </button>
        </form>
    </div>
</div>
</body>
</html>
