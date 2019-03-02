package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/FrontController", "/Front" })
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Extract Data from Request Object
		// Shall come to know who sent request
		String type = request.getParameter("txtType");
		
		
		
		response.setContentType("text/html");
		String message = "<html><body><h3>Hello from Front Controller</h3></body></html>";
		PrintWriter out = response.getWriter();
		out.println(message); // we are writing response from FrontController
		
		// Using RequestDispatcher API we are passing the Request and Response to the corresponding Servlet
		
		// Response shall not be shared back to the client if RequestDispatcher API uses forward method
		if(type.equals("register")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("Register");
			dispatcher.forward(request, response);
		}else if(type.equals("login")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("Login");
			dispatcher.forward(request, response);
			//dispatcher.include(request, response); 	// Response shall be shared back to the client if RequestDispatcher API uses forward method
		}else{
			
		}
		
		
	}

}
