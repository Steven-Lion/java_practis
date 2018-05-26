package java_XML;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class xmlDemo {

	public static void main(String[] args) throws Exception {
//			创建DocumentBuilderFactory对象.
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

//			创建DocumentBuilder对象.
			DocumentBuilder db = dbf.newDocumentBuilder();
			
//			传入xml文件.
			Document doc = db.parse("books.xml");
			
//			用NodeList获取总节点数
			NodeList booklist = doc.getElementsByTagName("book");
			
			System.out.println("一共有"+booklist.getLength()+"本书");
			
//			循环遍历的出子节点数目.
			for (int i = 0; i <booklist.getLength(); i++) {
				booklist.item(i);
			}
			
			for (int i = 0; i < booklist.getLength(); i++) {
//				得到子节点的节点
				Node bookitem = booklist.item(i);
				/*
				NamedNodeMap arrts = bookitem.getAttributes();
				
				for (int j = 0; j < arrts.getLength(); j++) {
					
					Node arrt = arrts.item(j);
					
					System.out.println(arrtgetNodeValue());
				}*/
//				将子节点强制转化为Element.
				Element book =(Element) booklist.item(i);
//				获取id的属性  
				String attrValue = book.getAttribute("id");
				
				System.out.println("=======================over遍历第"+(i+1)+"次 .");
				
				System.out.println("id属性的属性值为:"+attrValue);
				
				/*
				* 通过book元素的getChildNodes()得到所有子节点的集合，需要注意的是，在DOM的读取中，
				* 会将空格和回车看成是text节点类型，因此需要注意区分开。通过item（index）遍历所有子节点，通过item(
				* index)的getNodeName()方法还来获取子节点的名字，而获取它的属性值时，
				* 要注意直接使用getNodeValue()得到的是标签的值（一般是空）因此可以使用两种方法：
				* 1.使用item(index).getFirstNode().getNodeValue()来返回值(<name>冰与火之歌
				* </name>中冰与火之歌是name的子节点,而且这个节点类型是text，现在我们有节点name，
				* 只需要找到它的第一个节点的节点值便可以了)
				* 2.使用item(index).getTextContent()来返回属性值
				* 上面两种方法的区别在于在一个标签中是否包含的其他的子标签，如果有的话，那么第1个方法就仍得到null，
				* 第二个方法会返会将自标签的内容一起获得。
				*/
				
//				子节点的集合.
				NodeList childNode = book.getChildNodes();
				
				for (int j = 0; j < childNode.getLength(); j++) {
//					获得子节点的数目.
					Node childitem = childNode.item(j);
//					如果子节点的类型是ELEMENT_NODE就读取.
					if(childNode.item(j).getNodeType() == Node.ELEMENT_NODE){
						System.out.println("节点"+j+"名称:"+childNode.item(j).getNodeName()
//								.getFirstChild().getNodeValue()
//								或者.getTextContent()差不多.
								+  "      "+childNode.item(j).getTextContent());
					}
					
				}
				
				
			}
			
			
			
			
	}

}
