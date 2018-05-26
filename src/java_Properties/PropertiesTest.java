package java_Properties;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
	
	public static void main(String[] args) throws IOException {
//		method();
//		getAndSet();
		loadmethod();
	}
	
	public static void loadmethod() throws IOException{
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("info.txt");
		
		prop.load(fis);
		
//		增加属性并且写入到文件中使用Properties.store方法.
		
		prop.setProperty("goodmorning", "666");
		
		FileOutputStream fos = new FileOutputStream("info.txt");
		
		prop.store(fos,"------");
		
		System.out.println(prop);
		
		prop.list(System.out);
		
		fis.close();
		fos.close();
		
	}
	
	public static void method() throws IOException{
		BufferedReader bufReader = new BufferedReader(new FileReader("info.txt"));
		
		String line = null;
		
		Properties prop1 = new Properties();
		
		while( ( line = bufReader.readLine() )!= null){
			
			String[] arr = line.split("=");
			
			prop1.setProperty(arr[0], arr[1]);
			
			
		}
		bufReader.close();
		
		System.out.println(prop1);
	}
//	getAndSet();
	public static void getAndSet(){
		Properties prop = new Properties();
		
		prop.setProperty("no.1", "10");
		prop.setProperty("no.2", "20");
		
		String value = prop.getProperty("no.2");
		
		Set<String> names = prop.stringPropertyNames();
		
		for (String s : names){
		
			System.out.println(s + ":" +prop.getProperty(s));
		}
	}

}
