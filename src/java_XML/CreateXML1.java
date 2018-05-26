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
//		����DocumentBuilderFactory����.
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//		����DocumentBuilder����.
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
//		��bookstore���ڵ�������ӽڵ�book.
		Element book = document.createElement("book");
		Element name = document.createElement("name");
		name.setTextContent("����¶�");
		book.setAttribute("id", "1");
//		��name��ӵ�book�ڵ���.
		book.appendChild(name);
//      ��book�ڵ���ӵ�bookstore���ڵ���.
		bookstore.appendChild(book);
//		��bookstore�ڵ㣨�Ѿ�������book����ӵ�dom����.
		document.appendChild(bookstore);
		
//		DocumentBuilder db = getDocmentBuilder();
//		Document document = db.newDocument();
//		//document.setXmlStandalone(true);
//		Element bookstore = document.createElement("bookStore");
//		//��bookstore���ڵ�������ӽڵ�book
//		Element book = document.createElement("book");
//		Element name = document.createElement("name");
////		name.setNodeValue("С����");
//		name.setTextContent("С����");
//		book.appendChild(name);

		
//		����Transformer����.
		TransformerFactory tff = TransformerFactory.newInstance();
		try {
			//����Transformer����
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
