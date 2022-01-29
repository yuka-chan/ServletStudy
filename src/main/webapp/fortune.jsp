<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>your fortune</title>
</head>
<body>
	<%--fortune results --%>
	<%
		String[] results = {"super lucky","lucky","so so","bad","so bad"};
		int index = (int)(Math.random() * results.length);
		String result = results[index];
	%>
	
	<%-- date --%>
	<%
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String today = sdf.format(date);
	%>

	<p>Your fortune on <%=today%> is <%=result%>.</p>
</body>
</html>