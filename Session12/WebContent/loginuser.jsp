<%@page import="co.edureka.db.DBHelper"%>
<%@page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	
	<br/>
	<h4>Logging In.. ${param.txtEmail}</h4>
	<br/>

	<%
		
		User user = new User();
		// request is an implicit object to extract data from client request object 
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// JDBC Operaton in JSP
		DBHelper helper = new DBHelper();
		helper.createConnection();
		boolean check = helper.loginUser(user);
		helper.closeConnection();
		
		if(check){
			
			String name = "Mike";
			int age = 32;
			
			/*Cookie ck1 = new Cookie("keyName",name);
			Cookie ck2 = new Cookie("keyAge",String.valueOf(age));
			
			response.addCookie(ck1);
			response.addCookie(ck2);*/
			
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", age);
			
			//pageContext.setAttribute("keyName", name, PageContext.SESSION_SCOPE);
			//pageContext.getAttribute("keyName")
			
			// Try out URL ReWriting and Hidden Form Fields
	%>
		<%-- <h3>Hello <%= user.email %>, Your Login is Success</h3>
		<a href="home.jsp">Enter Home</a> --%>
		
		<jsp:forward page="home.jsp"/>
		
	<%		
		}else{
			response.sendRedirect("https://www.google.co.in");	
		}
	%>
</body>
</html>