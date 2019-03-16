<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	// Read Data from Request Object
	String data = request.getParameter("num");
	
	try{
		// Convert Data into Integer
		int num = Integer.parseInt(data);
		
		// Sending back Table of a Number as a Response
		for(int i=1;i<=10;i++){
			out.print(num+" "+i+"'s are "+(num*i)+"<br/>");
		}
		
	}catch(Exception e){
		out.print("Please Enter Correct Data !!");
	}
	
	// We can try Fetching Recored from DB and Send them back !! :) -> Try Writing the JDBC Code here !!


%>