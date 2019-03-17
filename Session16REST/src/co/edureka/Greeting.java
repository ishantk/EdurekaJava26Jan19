package co.edureka;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.servlet.ServletContainer;

@Path("/greeting")
public class Greeting { // REST-ful Web Service
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello(){ // Web Method
		String respone = "Plain Hello from Greeting Web Service | "+new Date(); // Plain Text as a Response from Web Service
		return respone;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){ // Web Method
		String respone = "<html><body><h3>HTML Hello from Greeting Web Service | "+new Date()+"</h3></body></html>"; // HTML as a Response from Web Service
		return respone;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){ // Web Method
		String respone = "<?xml version='1.0' encoding='UTF-8'><hello>XML Hello from Greeting Web Service | "+new Date()+"</hello>"; // XML as a Response from Web Service
		return respone;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){ // Web Method
		String respone = "{'message':'JSON Hello from Greeting Web Service | "+new Date()+"'}"; // JSON as a Response from Web Service
		return respone;
	}

}
