<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Health Check</title>
</head>
<body>
	<h1>Health Check</h1>
	
	<!-- form -->
	<form action="/ServletStudy/HealthCheck" method="post">
		<span>height : </span><input type="text" name="height">cm<br/>
		<span>weight : </span><input type="text" name="weight">kg<br/>
		<input type="submit" value="Submit">
	</form>
</body>
</html>