<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Health" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Health Check</title>
</head>
<body>
	<%-- get the instance from the request scope --%>
	<% 
	Health health = (Health)request.getAttribute("health");
	%>
	
	<!-- make result page -->
	<h1>Health Check Result</h1>
	<p>height   : <%= health.getHeight() %></p>
	<p>weight   : <%= health.getWeight() %></p>
	<p>BMI      : <%= health.getBmi() %></p>
	<p>BodyType : <%= health.getBodyType() %></p>
	<a href="/ServletStudy/HealthCheck">return</a> 
	
	
</body>
</html>