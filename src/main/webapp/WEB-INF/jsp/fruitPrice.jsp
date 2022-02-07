<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Fruit"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruit Price</title>
</head>
<body>
	<% Fruit fruit = (Fruit)request.getAttribute("fruit"); %>
	<p><%= fruit.getName() %>'s price is <%= fruit.getPrice() %>yen.
</body>
</html>