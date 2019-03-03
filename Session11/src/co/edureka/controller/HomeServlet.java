package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/HomeServlet", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//*************
		// Writing Response to User
		//*************
		response.setContentType("text/html"); // we can send text or html as a respons
		PrintWriter out = response.getWriter();
		
		Date date = new Date();
		
		String dateTime = date.toString();
		
		String message = "Welcome to Home !!";
		String res = "<html><body><center><h3>"+message+"</h3> Its: "+dateTime+"</center></body></html>";
		out.print(res); // Sending Back Response
		
		// Read All the cookies associated with our web app from Browser 
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" | "+ck.getValue()+"<br/>");
		}*/
		
		/*
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		*/
		
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("keyName");
		int age = (int)session.getAttribute("keyAge");
		
		out.print(">> Welcome, "+name+" | "+age);
		
		//session.invalidate();
		
		// Assignments: (Session Tracking Fundas)
		// Implement Login/Logout Functionality !!
		// Implement One Time Login i.e. Remember Me Use Case !!
	}

}
