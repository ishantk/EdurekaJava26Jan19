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
			
			// We shall extract data from DB. But here we are just doing a hard code. Assumptions !! 
			String name = "John Watson";
			int age = 30;
			
			// 1. Session Tracking - Cookies
			// Cookie is a HashMap of key value pair of type String.
			//Cookie ck1 = new Cookie("keyName", name);
			//Cookie ck2 = new Cookie("keyAge", String.valueOf(age));
			
			//ck1.setMaxAge(); 	// Cookies can have a life (MilliSeconds as Input)
			//ck1.setMaxAge(-1);// Life only during the session
			
			// We are going to add cookies in browser in client's machine
			//response.addCookie(ck1);
			//response.addCookie(ck2);
			
			// 2. Session Tracking - URL ReWriting
			//String homeLink = "<a href='Welcome'>Enter Home</a>";
			//String homeLink = "<a href='Welcome?name="+name+"&age="+age+"'>Enter Home</a>";
			
			// 3. Session Tracking - Hidden Form Fields
			/*String form = "<form action='Welcome' method='post'>"
						+ "<input type='hidden' name='name' value='"+name+"'/>"
						+ "<input type='hidden' name='age' value='"+age+"'/>"
						+ "<input type='submit' value='Enter Home'/>"
						+ "</form>";*/
			
			// 4. Session Tracking - HttpSession API
			HttpSession session = request.getSession(); // Obtain Reference to Session Object
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", age);
			String homeLink = "<a href='Welcome'>Enter Home</a>";
			message = user.email+" Logged In Successfully !!";
			
			String res = "<html><body><center><h3>"+message+"</h3> Its: "+dateTime+"<br/>"+homeLink+"</center></body></html>";
			
			out.print(res); // Sending Back Response
		}else{
			message = "Error while Logging In "+user.email+" Please check email or password and Retry!!";
			response.sendRedirect("https://google.co.in"); // We can use sendRedirect method to go to any resource
		}
			
		
		
		
		
	}

}
