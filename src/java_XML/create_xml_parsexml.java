package java_XML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.SAXException;

public class create_xml_parsexml {
	
	public ArrayList<Book> parserXML(){
//		�Ȼ�ȡһ��SAXParserFactory��ʵ��.
		SAXParserFactory factory = SAXParserFactory.newInstance();
//		ͨ��factory����SAXParserʵ��.
		SAXParserHardler handler = null;
		
		try {
			
			SAXParser parser = factory.newSAXParser();
//			����SAXParserHandler����.
			handler = new SAXParserHardler();
			parser.parse("books.xml", handler);
			 
		} catch (ParserConfigurationException | SAXException e) {
			e.printStackTrace();
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return handler.getBooks_list();
	}
	
	public void creatXML(){
		ArrayList<Book> booklist = parserXML();
//		 ����xml
//		����һ��TransformerFactory��Ķ���.
		SAXTransformerFactory tff = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
		try {
//			ͨ��SAXTransformerFactory���󴴽�һ��TransformerHandler����.
		TransformerHandler handler = tff.newTransformerHandler();
//		ͨ��handler���󴴽�һ��Transfomer����.
		Transformer tr = handler.getTransformer();
//		ͨ��Transformer�������ɵ�xml�ļ���������
//		����xml�ı���
		tr.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
//		����xml���Ƿ���.
		tr.setOutputProperty(OutputKeys.INDENT,"yes");
//		����Result����.
		File f = new File("src/res/newbooks.xml");
		if(!f.exists()){
				f.createNewFile();
			 
		}
		try {
//			����Result������ʹ����handler����.
			Result  result = new StreamResult(new FileOutputStream(f));
			handler.setResult(result);
//			����handler�������xml�ļ����ݵı༭.
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

}
