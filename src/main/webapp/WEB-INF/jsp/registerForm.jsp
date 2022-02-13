<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
</head>
<body>
	<form action="/ServletStudy/RegisterUser" method="post">
		<span>Login ID：</span><input type="text" name="id"><br/>
		<span>Password：</span><input type="password" name="password"><br/>
		<span>Name：    </span><input type="text" name="name"><br/>
		<input type="submit" value="confirm">
	</form>
</body>
</html>