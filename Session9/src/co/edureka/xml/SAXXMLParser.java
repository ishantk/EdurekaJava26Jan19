package co.edureka.xml;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.TransformerFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler{
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println(">> Document Parsing Started");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//System.out.print("<"+qName+">"); // qName is element name !!
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch,start,length);
		System.out.print(data);
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		//System.out.println("</"+qName+">");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println(">> Document Parsing Finished");
	}
	
}

public class SAXXMLParser {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/Employees2019Edu.xml");
			FileInputStream in = new FileInputStream(file);
			
			MyHandler handler = new MyHandler(); // Defines Stream of Events as Methods which we overrided
			
			// API to perform Parsing
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			
			parser.parse(in, handler);
			
			// Assignmet : Read data into Object and create an ArrayList<Employee> 
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
