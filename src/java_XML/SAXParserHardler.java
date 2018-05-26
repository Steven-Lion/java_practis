package java_XML;


import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserHardler extends DefaultHandler {
	
	int bookIndex = 0;
	
	String value = null;
	Book book = null;
	
	private  ArrayList<Book> books_list = new ArrayList<Book>();
	
	
	/*
	 * 用来遍历xml文件的开始标签的.
	 * 
	 */
	
	public ArrayList<Book> getBooks_list() {
		return books_list;
	}
	public void setBooks_list(ArrayList<Book> books_list) {
		this.books_list = books_list;
	}
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
//		已经知道book的属性.
		if(qName.equals("book")){
			 book = new Book();
			
			System.out.println("==========开始遍历第"+(bookIndex+1)+"本书的内容==========");
			
//		1.	已经知道id的属性名.
//			System.out.println(attributes.getValue("id"));
			
//		2. 不知道属性名称从而获取属性的方式.
//		得到属性的个数.
		int num = attributes.getLength();

		for (int i = 0; i < num; i++) {
			System.out.println("属性名是:"+attributes.getQName(i));
			System.out.println("属性值是:"+attributes.getValue(i));
			
			if(attributes.getQName(i).equals("id")){
				book.setId(attributes.getQName(i));
				
			}
			
		
		
		else if (!qName.equals("book") && !qName.equals("bookstore")){
				System.out.print("节点值为 : "+qName);
			
		    }
		
		}
		
		}
	}
	/*
	 * 用来遍历xml文件的结束标签的.
	 * 
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
//		调用DefaultHandler类的endElement方法
		super.endElement(uri, localName, qName);
		
		if(qName.equals("book")){
			bookIndex++;
			
			books_list.add(book);
			
			book = null;
			
			System.out.println("==========结束遍历"+bookIndex+"书的内容==========");
		}
		else if (qName.equals("name")){
			book.setName(value);
		}
		else if (qName.equals("author")){
			book.setAuthor(value);
		}
		else if (qName.equals("price")){
			book.setPrice(value);
		}
		else if (qName.equals("year")){
			book.setYear(value);
		}
		else if (qName.equals("language")){
	     	book.setLanguage(value);
		}
	}
	/*
	 * 用来标识解析开始的.
	 * 
	 */
	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		System.out.println("SAX解析开始");
		
	}
	/*
	 * 用来标识解析结束的.
	 * 
	 */
	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
		System.out.println("SAX解析结束");
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		super.characters(ch, start, length);
		
	    value = new String(ch, start, length);
		
		if(!value.trim().equals("")){
			
			System.out.println("设置属性值为"+value);
			
			
			
		}
		
		
	}

}
