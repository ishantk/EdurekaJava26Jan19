package co.edureka.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

	public void destroy() {
		System.out.println(">> Filter Destroy");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<center><h3>**Filter PreProcessing**</h3></center>");

		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		if(!email.isEmpty() && !password.isEmpty()){
			// pass the request along the filter chain i.e. to the next Servlet i.e. LoginServlet
			chain.doFilter(request, response);
		}else{
			out.print("<center><h3>@@Please Enter Correct Details First@@</h3></center>");
		}
		
		
		out.print("<center><h3>**Filter PostProcessing**</h3></center>");
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println(">> Filter init");
	}

}
