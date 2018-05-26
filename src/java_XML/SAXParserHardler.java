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
	 * ��������xml�ļ��Ŀ�ʼ��ǩ��.
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
//		�Ѿ�֪��book������.
		if(qName.equals("book")){
			 book = new Book();
			
			System.out.println("==========��ʼ������"+(bookIndex+1)+"���������==========");
			
//		1.	�Ѿ�֪��id��������.
//			System.out.println(attributes.getValue("id"));
			
//		2. ��֪���������ƴӶ���ȡ���Եķ�ʽ.
//		�õ����Եĸ���.
		int num = attributes.getLength();

		for (int i = 0; i < num; i++) {
			System.out.println("��������:"+attributes.getQName(i));
			System.out.println("����ֵ��:"+attributes.getValue(i));
			
			if(attributes.getQName(i).equals("id")){
				book.setId(attributes.getQName(i));
				
			}
			
		
		
		else if (!qName.equals("book") && !qName.equals("bookstore")){
				System.out.print("�ڵ�ֵΪ : "+qName);
			
		    }
		
		}
		
		}
	}
	/*
	 * ��������xml�ļ��Ľ�����ǩ��.
	 * 
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
//		����DefaultHandler���endElement����
		super.endElement(uri, localName, qName);
		
		if(qName.equals("book")){
			bookIndex++;
			
			books_list.add(book);
			
			book = null;
			
			System.out.println("==========��������"+bookIndex+"�������==========");
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
	 * ������ʶ������ʼ��.
	 * 
	 */
	@Override
	public void startDocument() throws SAXException {
		super.startDocument();
		System.out.println("SAX������ʼ");
		
	}
	/*
	 * ������ʶ����������.
	 * 
	 */
	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
		System.out.println("SAX��������");
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		super.characters(ch, start, length);
		
	    value = new String(ch, start, length);
		
		if(!value.trim().equals("")){
			
			System.out.println("��������ֵΪ"+value);
			
			
			
		}
		
		
	}

}
