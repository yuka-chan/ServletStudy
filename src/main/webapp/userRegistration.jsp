<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
	<!-- Registraton Form -->
	<form action="/ServletStudy/userRegistration?start_time=<%=System.currentTimeMillis()%>" method="post">
		<span>name: </span>
		<input type="text" name="name"><br>
		<span>gender: </span>
		<input type="radio" name="gender" value="0">male
		<input type="radio" name="gender" value="1">female<br>
		<span>password: </span>
		<input type="password" name="password">※4 alphanumeric characters.<br>
		<input type="submit" value="send">
	</form>
</body>
</html>