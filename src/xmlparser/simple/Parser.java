package xmlparser.simple;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
 
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.bind.annotation.*;
public class Parser {
public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document document = builder.parse(new File("test.xml"));
    
    
  //Normalize the XML Structure; It's just too important !!
    document.getDocumentElement().normalize();
     
    //Here comes the root node
    Element root = document.getDocumentElement();
    System.out.println(root.getNodeName());
    
    NodeList nList = document.getElementsByTagName("Employees");
    System.out.println("============================");
     
    for (int temp = 0; temp < nList.getLength(); temp++)
    {
     Node node = nList.item(temp);
     System.out.println("");    //Just a separator
     if (node.getNodeType() == Node.ELEMENT_NODE)
     {
        //Print each employee's detail
        Element eElement = (Element) node;
        System.out.println("Employee id : "    + eElement.getAttribute("ID"));
        System.out.println("First Name : "  + eElement.getElementsByTagName("Firstname").item(0).getTextContent());
        System.out.println("Last Name : "   + eElement.getElementsByTagName("Lastname").item(0).getTextContent());
        System.out.println("Age : "    + eElement.getElementsByTagName("Age").item(0).getTextContent());
     }
}
}}
