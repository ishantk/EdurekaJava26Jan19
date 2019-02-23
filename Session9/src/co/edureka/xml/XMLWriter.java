package co.edureka.xml;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XMLWriter {

	public static void main(String[] args) {
		
		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // Represents a new Empty XML Document !!
			
			// Represents Tags within our XMl File
			Element elmRoot = document.createElement("employees");
			Element elmEmp = document.createElement("employee");
			Element elmEid = document.createElement("eid");
			Element elmName = document.createElement("name");
			Element elmSalary = document.createElement("salary");
			Element elmDesignation = document.createElement("designation");
			
			Employee eRef = new Employee(101, "George", 60000, "Lead Engineer");
			
			// Data for the Tags:
			/*Text txtEid = document.createTextNode("101");
			Text txtName = document.createTextNode("George");
			Text txtSalary = document.createTextNode("60000");
			Text txtDesignation = document.createTextNode("Lead Engineer");*/
			
			Text txtEid = document.createTextNode(String.valueOf(eRef.eid));
			Text txtName = document.createTextNode(eRef.name);
			Text txtSalary = document.createTextNode(String.valueOf(eRef.salary));
			Text txtDesignation = document.createTextNode(eRef.designation);
			
			// Append Data in Tags:
			elmEid.appendChild(txtEid); 				// tag eid will contain data 101 -> <eid>101</eid>
			elmName.appendChild(txtName);				// tag name will contain data 101 -> <name>George</name>
			elmSalary.appendChild(txtSalary);			// tag salary will contain data 101 -> <salary>60000</salary>
			elmDesignation.appendChild(txtDesignation); // tag designation will contain data 101 -> <designation>Lead Engineer</designation>
			
			elmEmp.appendChild(elmEid);
			elmEmp.appendChild(elmName);
			elmEmp.appendChild(elmSalary);
			elmEmp.appendChild(elmDesignation);
			
			/*
			 	<employee>
			 		<eid>101</eid>
			 		<name>George</name>
			 		<salary>60000</salary>
			 		<designation>Lead Engineer</designation>
			 	</employee>
			 */
			
			elmRoot.appendChild(elmEmp);
			/*
			 <employees>  
			 	<employee>
			 		<eid>101</eid>
			 		<name>George</name>
			 		<salary>60000</salary>
			 		<designation>Lead Engineer</designation>
			 	</employee>
			 </employees>
		 */
			
		document.appendChild(elmRoot); // We have appended data of root element in the document !!	
			
		// Generating an XML File!! Write Data contained in document in File.	
		File file = new File("/Users/ishantkumar/Downloads/Employees2019Edu.xml");
		FileOutputStream out = new FileOutputStream(file); // To write data in file
		
		//DOMSource represents the document
		DOMSource source = new DOMSource(document);
		
		//StreamResult represent file in which we wish to write the above document
		StreamResult result = new StreamResult(out);
		
		// Transformer API which will further convert DOMSource into Stream Result
		TransformerFactory tFactory = TransformerFactory.newInstance();
		Transformer transformer = tFactory.newTransformer(); // API shall convert Source to Result
		
		// Perform Write Operation for XML !!
		transformer.transform(source, result);
		
		System.out.println(">> "+file.getName()+" created !!");
			
		} catch (Exception e) {
			System.out.println("Some Exception:"+e);
		}
		
	}

}
