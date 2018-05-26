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
//			����DocumentBuilderFactory����.
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

//			����DocumentBuilder����.
			DocumentBuilder db = dbf.newDocumentBuilder();
			
//			����xml�ļ�.
			Document doc = db.parse("books.xml");
			
//			��NodeList��ȡ�ܽڵ���
			NodeList booklist = doc.getElementsByTagName("book");
			
			System.out.println("һ����"+booklist.getLength()+"����");
			
//			ѭ�������ĳ��ӽڵ���Ŀ.
			for (int i = 0; i <booklist.getLength(); i++) {
				booklist.item(i);
			}
			
			for (int i = 0; i < booklist.getLength(); i++) {
//				�õ��ӽڵ�Ľڵ�
				Node bookitem = booklist.item(i);
				/*
				NamedNodeMap arrts = bookitem.getAttributes();
				
				for (int j = 0; j < arrts.getLength(); j++) {
					
					Node arrt = arrts.item(j);
					
					System.out.println(arrtgetNodeValue());
				}*/
//				���ӽڵ�ǿ��ת��ΪElement.
				Element book =(Element) booklist.item(i);
//				��ȡid������  
				String attrValue = book.getAttribute("id");
				
				System.out.println("=======================over������"+(i+1)+"�� .");
				
				System.out.println("id���Ե�����ֵΪ:"+attrValue);
				
				/*
				* ͨ��bookԪ�ص�getChildNodes()�õ������ӽڵ�ļ��ϣ���Ҫע����ǣ���DOM�Ķ�ȡ�У�
				* �Ὣ�ո�ͻس�������text�ڵ����ͣ������Ҫע�����ֿ���ͨ��item��index�����������ӽڵ㣬ͨ��item(
				* index)��getNodeName()����������ȡ�ӽڵ�����֣�����ȡ��������ֵʱ��
				* Ҫע��ֱ��ʹ��getNodeValue()�õ����Ǳ�ǩ��ֵ��һ���ǿգ���˿���ʹ�����ַ�����
				* 1.ʹ��item(index).getFirstNode().getNodeValue()������ֵ(<name>�����֮��
				* </name>�б����֮����name���ӽڵ�,��������ڵ�������text�����������нڵ�name��
				* ֻ��Ҫ�ҵ����ĵ�һ���ڵ�Ľڵ�ֵ�������)
				* 2.ʹ��item(index).getTextContent()����������ֵ
				* �������ַ���������������һ����ǩ���Ƿ�������������ӱ�ǩ������еĻ�����ô��1���������Եõ�null��
				* �ڶ��������᷵�Ὣ�Ա�ǩ������һ���á�
				*/
				
//				�ӽڵ�ļ���.
				NodeList childNode = book.getChildNodes();
				
				for (int j = 0; j < childNode.getLength(); j++) {
//					����ӽڵ����Ŀ.
					Node childitem = childNode.item(j);
//					����ӽڵ��������ELEMENT_NODE�Ͷ�ȡ.
					if(childNode.item(j).getNodeType() == Node.ELEMENT_NODE){
						System.out.println("�ڵ�"+j+"����:"+childNode.item(j).getNodeName()
//								.getFirstChild().getNodeValue()
//								����.getTextContent()���.
								+  "      "+childNode.item(j).getTextContent());
					}
					
				}
				
				
			}
			
			
			
			
	}

}
