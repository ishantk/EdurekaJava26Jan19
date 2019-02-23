package co.edureka.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMXMLParser {

	public static void main(String[] args) {
		try {
			
			// List
			ArrayList<Employee> employees = new ArrayList<Employee>();
			
			File file = new File("/Users/ishantkumar/Downloads/Employees2019Edu.xml");
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file); // Reads XML File and generates a Document Object in Java
			
			String rootElement = document.getDocumentElement().getTagName();
			System.out.println("Root Element is: "+rootElement);
			
			NodeList nodeList = document.getElementsByTagName("employee");
			System.out.println(nodeList.getLength()+" employee tags found !!");
			
			System.out.println();
			
			// Iterate in NodeList
			for(int i=0;i<nodeList.getLength();i++){
				Node node = nodeList.item(i); // -> i will be 0, 1 and 2 in our case
				// Downcast Node to Element so as to fetch the data 
				Element element = (Element)node;
				
				String eid = element.getElementsByTagName("eid").item(0).getTextContent();
				String name = element.getElementsByTagName("name").item(0).getTextContent();
				String salary = element.getElementsByTagName("salary").item(0).getTextContent();
				String designation = element.getElementsByTagName("designation").item(0).getTextContent();
				
				//System.out.println(eid+"\t"+name+"\t"+salary+"\t"+designation);
				
				int iEid = Integer.parseInt(eid);
				int iSalary = Integer.parseInt(salary);
				
				// We read an XMl File and converted the data into Object
				Employee emp = new Employee(iEid, name, iSalary, designation);
				// Lets add all the Objects in ArrayList
				employees.add(emp);

			}
			
			for(Employee eRef : employees){
				System.out.println(eRef);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
