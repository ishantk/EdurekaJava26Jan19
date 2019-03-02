package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.DBHelper;
import co.edureka.model.User;


@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	// doPost is like service which gets executed automatically but in case client sends a post request only !!
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(">> doPost executed");
		
		//*************
		// Extracting Data (request.getParameter) from Request Object(from Client) and putting the data in User Object (On Server)
		//*************
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(">> You Entered: "+user); // execute toString()
		
		
		//*************
		// Execute Business Logic - Save user Object in DataBase
		//*************
		DBHelper helper = new DBHelper();
		helper.createConnection();
		boolean check = helper.loginUser(user);
		helper.closeConnection();
		
		
		//*************
		// Writing Response to User
		//*************
		response.setContentType("text/html"); // we can send text or html as a respons
		PrintWriter out = response.getWriter();
		
		Date date = new Date();
		
		String dateTime = date.toString();
		String message = "";
		if(check){
			message = user.email+" Logged In Successfully !!";
		}else{
			message = "Error while Logging In "+user.email+" Please check email or password and Retry!!";
			response.sendRedirect("https://google.co.in"); // We can use sendRedirect method to go to any resource
		}
			
		
		String res = "<html><body><center><h3>"+message+"</h3> Its: "+dateTime+"</center></body></html>";
		out.print(res); // Sending Back Response
		
		
	}

}
