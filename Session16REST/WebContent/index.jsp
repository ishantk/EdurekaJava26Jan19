<%@ page import="javax.ws.rs.core.UriBuilder"%>
<%@ page import="javax.ws.rs.client.WebTarget"%>
<%@ page import="javax.ws.rs.client.ClientBuilder"%>
<%@ page import="javax.ws.rs.client.Client"%>
<%@ page import="javax.ws.rs.core.MediaType"%>
<%@ page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RESTFUL Web Service Client</title>
</head>
<body>
	<center>
		<br/>
		<h3>Welcome to RESTful DEMO</h3>
		<br/>
	
		<%
			// We are going to consume our web service i.e. access web service
			ClientConfig cConfig = new ClientConfig();
			Client client = ClientBuilder.newClient(cConfig);
			WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8099/Session16REST").build());
									//	/rest/greeting
			String plainResponse = target.path("rest").path("greeting").request().accept(MediaType.TEXT_PLAIN).get(String.class);
			String htmlResponse = target.path("rest").path("greeting").request().accept(MediaType.TEXT_HTML).get(String.class);
			String xmlResponse = target.path("rest").path("greeting").request().accept(MediaType.TEXT_XML).get(String.class);
			String jsonResponse = target.path("rest").path("greeting").request().accept(MediaType.APPLICATION_JSON).get(String.class);
			
		%>
		
		<br/><br/>
		Plain Response:
		<%= plainResponse %>
		<br/><br/>
		HTML Response:
		<%= htmlResponse %>
		<br/><br/>
		XML Response:
		<%= xmlResponse %>
		<br/><br/>
		JSON Response:
		<%= jsonResponse %>
	
	</center>
</body>
</html>