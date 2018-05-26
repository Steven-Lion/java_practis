package java_XML;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class JDOM_Test {

	public static void main(String[] args) throws JDOMException, IOException {
//		����books.xml�ļ���JDOM����.
//		׼������.
		SAXBuilder saxBuilder = new SAXBuilder();
		
		try {
			
//		����һ���ļ�������.
			FileInputStream fis = new FileInputStream("src/res/books.xml");
//		 �����������ص�saxBuilder.build����
			Document doc = saxBuilder.build(fis);
//		��ȡdoc�µĸ��ڵ�
			Element element = doc.getRootElement();
//		��ȡ���ڵ��ڵ��ӽڵ�.
			List<Element> ele_list = element.getChildren();
			
//		1.֪�����ƵĿ���
//		System.out.println("���ID����ֵ  : "+book.getAttributeValue("id"));
		
			
//		2.��֪�����������ƺ�����.
//		ʹ��forrech����
		    for(Element book : ele_list){
		 
		    	List<Attribute> attrlist = book.getAttributes();
		    	
//		��book�ڵ��µ��ӽڵ�Ľڵ����ͽڵ�ֵ�ñ���.
		    	List<Element> booklist1 =  book.getChildren();
		    	for(Element book1 : booklist1){
		    		System.out.println("0000000000000"+book1.getName());
		    		System.out.println("1111111111111"+book1.getValue());
		    	}
		    	
		    	/*for(Attribute attr : attrlist){
		    		System.out.println(attr.getName());
		    		System.out.println(attr.getValue());
		    	}*/
		    	
		    
		    	
		    }
		    
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
