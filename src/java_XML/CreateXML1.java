package java_XML;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXML1 {
    public DocumentBuilder getDocmentBuilder(){
//		创建DocumentBuilderFactory对象.
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//		创建DocumentBuilder对象.
		DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		return db;
		
    }
	public static void main(String[] args) {
		CreateXML1 test = new CreateXML1();
		
		test.createXML();
		System.out.println("finish");
	}
	public void createXML(){
		
		DocumentBuilder db = getDocmentBuilder();
		
		Document document = db.newDocument();
		
		Element bookstore = document.createElement("bookstore");
//		向bookstore根节点中添加子节点book.
		Element book = document.createElement("book");
		Element name = document.createElement("name");
		name.setTextContent("百年孤独");
		book.setAttribute("id", "1");
//		将name添加到book节点中.
		book.appendChild(name);
//      将book节点添加到bookstore根节点中.
		bookstore.appendChild(book);
//		将bookstore节点（已经包含了book）添加到dom树中.
		document.appendChild(bookstore);
		
//		DocumentBuilder db = getDocmentBuilder();
//		Document document = db.newDocument();
//		//document.setXmlStandalone(true);
//		Element bookstore = document.createElement("bookStore");
//		//向bookstore根节点中添加子节点book
//		Element book = document.createElement("book");
//		Element name = document.createElement("name");
////		name.setNodeValue("小王子");
//		name.setTextContent("小王子");
//		book.appendChild(name);

		
//		创建Transformer对象.
		TransformerFactory tff = TransformerFactory.newInstance();
		try {
			//创建Transformer对象
			Transformer tf = tff.newTransformer();
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.transform(new DOMSource(document),new StreamResult(new File("books1.xml")));
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		
	}

}
