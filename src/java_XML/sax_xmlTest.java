package java_XML;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class sax_xmlTest {

	public static void main(String[] args) {
//			��ȡһ��Saxparserfactory��ʵ����
		SAXParserFactory factory =SAXParserFactory.newInstance();
//			ͨ��factory��ȡSAXParserʵ����
		try {
			
			SAXParser parser = factory.newSAXParser();
			
			SAXParserHardler handler = new SAXParserHardler();
			
			parser.parse("books.xml", handler);
			
			System.out.println("һ��"+handler.getBooks_list().size()+"����");
			
			for(Book book1 : handler.getBooks_list()){
				System.out.println("1"+book1.getAuthor());
				System.out.println("2"+book1.getId());
				System.out.println("3"+book1.getName());
				System.out.println("4"+book1.getPrice());
				System.out.println("5"+book1.getYear());
				System.out.println("6"+book1.getLanguage());
			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e){
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
