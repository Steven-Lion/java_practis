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
//		先获取一个SAXParserFactory的实例.
		SAXParserFactory factory = SAXParserFactory.newInstance();
//		通过factory湖区SAXParser实例.
		SAXParserHardler handler = null;
		
		try {
			
			SAXParser parser = factory.newSAXParser();
//			创建SAXParserHandler对象.
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
//		 生成xml
//		生成一个TransformerFactory类的对象.
		SAXTransformerFactory tff = (SAXTransformerFactory) SAXTransformerFactory.newInstance();
		try {
//			通过SAXTransformerFactory对象创建一个TransformerHandler对象.
		TransformerHandler handler = tff.newTransformerHandler();
//		通过handler对象创建一个Transfomer对象.
		Transformer tr = handler.getTransformer();
//		通过Transformer对象生成的xml文件进行设置
//		设置xml的编码
		tr.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
//		设置xml的是否换行.
		tr.setOutputProperty(OutputKeys.INDENT,"yes");
//		创建Result对象.
		File f = new File("src/res/newbooks.xml");
		if(!f.exists()){
				f.createNewFile();
			 
		}
		try {
//			创建Result对象并且使其与handler关联.
			Result  result = new StreamResult(new FileOutputStream(f));
			handler.setResult(result);
//			利用handler对象进行xml文件内容的编辑.
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
