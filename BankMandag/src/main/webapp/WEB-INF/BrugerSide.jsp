<%--
  Created by IntelliJ IDEA.
  User: nbh
  Date: 22/03/2022
  Time: 10.05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;meta charset=UTF-8" language="java" %>
<html>
<head>
    <title>Brugerside</title>
</head>
<body style="display: grid; place-content: center;">

<h1>Velkommen ${sessionScope.navn}, du er nu logget ind på din konto</h1>

din saldo er ${sessionScope.konto.saldo}
<form action="transaktion-servlet" style="display: grid; place-content: center;">
<h2>Deposit</h2>
    <label for="deposit"></label>
    <input type="text" name="deposit" id="deposit" value="0">
    <input type="submit" value="deposit">
</form>
<form action="transaktion-servlet" method="post" style="display: grid; place-content: center;">
<h2>Withdraw</h2>
    <label for="withdraw"></label>
    <input type="text" name="withdraw" id="withdraw" value="0">
    <input type="submit" value="withdraw">
</form>
</body>
</html>
