<%@ page import="co.edureka.db.DBHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RegisterUser</title>
</head>
<body>
	
	<%
		
		User user = new User();
		// request is an implicit object to extract data from client request object 
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		// JDBC Operaton in JSP
		DBHelper helper = new DBHelper();
		helper.createConnection();
		int i = helper.insertUserInDB(user);
		helper.closeConnection();
		
		if(i>0){
	%>
		<h3>Hello <%= user.name %>, Your Registration Successfully Done !!</h3>
	<%		
		}else{
	%>	
		<h3>Error while Registration !!</h3>
	<%	
		}
	%>
	
</body>
</html>