<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LMS</title>
</head>
<body>
	<%
			Date date = new Date();
		%>
	<center>
		**********************
		<h3>Welcome to LMS</h3>
		<%= date %>
		<br/>
		**********************
		<br/>
	</center>
</body>
</html>