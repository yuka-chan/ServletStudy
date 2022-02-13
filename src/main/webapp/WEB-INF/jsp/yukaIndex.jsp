<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.SiteEV" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yuka's Profile</title>
<% SiteEV siteEV = (SiteEV)application.getAttribute("siteEV"); %>
</head>
<body>
	<h1>I'm Yuka.</h1>
	<a href="/ServletStudy/YukaIndex?action=like">like:</a>
	<span><%= siteEV.getLike() %>  </span>
	<a href="/ServletStudy/YukaIndex?action=dislike">dislike:</a>
	<span><%= siteEV.getDislike() %></span>
</body>
</html>