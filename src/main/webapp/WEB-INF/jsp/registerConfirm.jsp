<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
</head>
<body>
	<% User user = (User)session.getAttribute("user");%>

	<p>Register with the following contents.</p>
	<p>OK?</p>
	<span>Login ID：</span><span><%= user.getId() %></span><br/>
	<span>Name：    </span><span><%= user.getName() %></span><br/>
	<a href="/ServletStudy/RegisterUser?action=done">Register</a><br/>
	<a href="/ServletStudy/RegisterUser">Back</a>
</body>
</html>