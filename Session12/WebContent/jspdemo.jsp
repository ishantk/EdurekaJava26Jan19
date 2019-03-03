<%@page import="co.edureka.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>    
<%@ page isThreadSafe="true" %>
<%@ page buffer="8kb" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>
	<center>
		<h3>Welcome to JSP Demo !!</h3>
		
		<b>pi is: <% out.print(pi); %></b>
		
		<h3>Sriptlet Demo</h3>
		<% 
			int a = 10;
			int b = 20;
			int c = a+b;
			out.print("c is: "+c); // out is an implicit object for writing Response
		%>
		<br/>
		<b>a is: <% out.print(c); %></b>	
		
		<h3>Declarative Demo</h3>
		<%!
			double pi = 3.14;
			double area(double radius){
				return pi * radius * radius;
			}
		
		%>
		
		<jsp:include page="header.jsp"/>
		
		<br/>
		<b>pi is: <% out.print(pi); %></b>
		<br/>
		<b>Area of Circle with radius 2.2 is: <% out.print(area(2.2)); %></b>	
		
		<h3>Expression Demo</h3>
		<b>pi is: <%= pi %></b>
		<br/>
		<b>Area of Circle with radius 3.3 is: <%= area(3.3) %></b>
		
		
		<%
			int[] arr = {10, 20, 30, 40, 50};
			out.print("<h4>arr[0] is: "+arr[0]+"</h4>");
			/*try{
				out.print("<h4>arr[10] is: "+arr[10]+"</h4>");
			}catch(Exception e){
				out.print("<h4>Some Error !!</h4>");
			}*/
		%>
		
		<%
			// Object Construction
			Student s1 = new Student(); 
			
			// Writing Data in Object
			s1.setRoll(101);
			s1.setName("Leo");
		%>
		<!-- Reading Data from Object -->
		<i>
		<br/>
		s1 roll is: <%= s1.getRoll() %>
		<br/>
		s1 name is: <%= s1.getName() %>
		</i>
		
		<jsp:useBean id="s2" class="co.edureka.model.Student"/>
		
		<jsp:setProperty property="roll" name="s2" value="201"/>
		<jsp:setProperty property="name" name="s2" value="Mike"/>
		
		<br/>
		<i>
		<br/>
		s2 roll is: <jsp:getProperty name="s2" property="roll"/>
		<br/>
		s2 name is: <jsp:getProperty name="s2" property="name"/>
		</i>
		<br/>
		
		
	</center>
</body>
</html>