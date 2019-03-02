package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.edureka.db.DBHelper;
import co.edureka.model.User;


@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println(">> init executed");
	}

	public void destroy() {
		System.out.println(">> destroy executed");
	}

	// handles both get and post requests
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">> service executed");
		
		//*************
		// Extracting Data (request.getParameter) from Request Object(from Client) and putting the data in User Object (On Server)
		//*************
		User user = new User();
		
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		System.out.println(">> You Entered: "+user); // execute toString()
		
		
		//*************
		// Execute Business Logic - Save user Object in DataBase
		//*************
		DBHelper helper = new DBHelper();
		helper.createConnection();
		int i = helper.insertUserInDB(user);
		helper.closeConnection();
		
		
		//*************
		// Writing Response to User
		//*************
		response.setContentType("text/html"); // we can send text or html as a respons
		PrintWriter out = response.getWriter();
		
		Date date = new Date();
		
		String dateTime = date.toString();
		String message = "";
		if(i>0){
			message = "Thank you, "+user.name+" for Registering with us !!";
		}else{
			message = "Error while Registering "+user.name+" !!";
		}
			
		
		String res = "<html><body><center><h3>"+message+"</h3> Its: "+dateTime+"</center></body></html>";
		out.print(res); // Sending Back Reponse
		
		
	}

}
