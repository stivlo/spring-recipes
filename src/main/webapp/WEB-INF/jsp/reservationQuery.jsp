<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Reservation Query</title>
</head>
<body>

<form method="post">
Court Name <input type="text" name="courtName" value="${courtName}"/>
<input type="submit" value="Query"/>
</form>

<table border="1">
    <tr>
        <th>Court Name</th>
        <th>Date</th>
        <th>Hour</th>
        <th>Player</th>
    </tr>
    <c:forEach items="${reservations}" var="reservation">
    <tr>
        <td>${reservation.courtName}</td>
        <td><fmt:formatDate value="${reservation.date}" pattern="yyyy-MM-dd"/></td>
        <td>${reservation.hour}</td>
        <td>${reservation.player.name}</td>
    </tr>
    </c:forEach>
</table>

</body>
</html>