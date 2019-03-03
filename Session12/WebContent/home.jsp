<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Home</title>
</head>
<body>
	<center>
		
		<h3>Welcome to Home</h3>
		
		<br/><br/>
		
		<%
			/*Cookie[] ckArr = request.getCookies();
			for(Cookie ck : ckArr){
				out.print(ck.getName()+" | "+ck.getValue()+"<br/>");
			}*/
			
			String name = (String)session.getAttribute("keyName");
			int age = (int)session.getAttribute("keyAge");
		
		%>
		
		<h4>Name is: <%= name %></h4>
		<h4>Age is: <%= age %></h4>
	</center>
</body>
</html>