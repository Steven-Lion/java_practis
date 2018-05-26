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
//		进行books.xml文件的JDOM解析.
//		准备工作.
		SAXBuilder saxBuilder = new SAXBuilder();
		
		try {
			
//		创建一个文件输入流.
			FileInputStream fis = new FileInputStream("src/res/books.xml");
//		 将输入流加载到saxBuilder.build方法
			Document doc = saxBuilder.build(fis);
//		获取doc下的根节点
			Element element = doc.getRootElement();
//		获取根节点在的子节点.
			List<Element> ele_list = element.getChildren();
			
//		1.知道名称的可以
//		System.out.println("输出ID的数值  : "+book.getAttributeValue("id"));
		
			
//		2.不知道根结点的名称和数量.
//		使用forrech遍历
		    for(Element book : ele_list){
		 
		    	List<Attribute> attrlist = book.getAttributes();
		    	
//		对book节点下的子节点的节点名和节点值得遍历.
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
