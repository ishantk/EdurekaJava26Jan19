<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL - JSP Standard Tag Library</title>
</head>
<body>

	<%
		for(int i =1;i<=10;i++){
			out.print(i+"<br/>");
		}
	
		int age1 = 18;
	%>
	
	<br/><br/>
	
	<c:forEach var="j" begin="1" end="10">
		<c:out value="${j}"/><br/>
	</c:forEach>
	
	<c:set var="age2" value="18"/>
	
	<%-- <c:redirect url="https://google.co.in"/> --%>
	<!-- Explore SQL Tags for DB operation: https://docs.oracle.com/javaee/5/tutorial/doc/bnald.html -->
	

</body>
</html>