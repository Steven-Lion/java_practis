package java_Properties;

import java.util.Properties;
import java.io.*;

public class propertiesUseTimes {
	
	public static void main (String[] args) throws IOException{
		countTime();
		
	}
	public static void countTime() throws IOException{
		
		Properties prop = new Properties();
		
		File countfile = new File("count.ini");
		
//		�ж��ļ��Ƿ����.
		
		if(!countfile.exists()){
			countfile.createNewFile();
		}
		
		FileInputStream  fis = new FileInputStream(countfile);
		
		prop.load(fis);
		
		int countNums = 0;
		
		String value = prop.getProperty("time");
		
		if(value != null){
			countNums = Integer.parseInt(value);
			if(countNums >= 3 	){
				System.out.println("ʹ�ô������þ������ֵ������");
			}
		}
		
		countNums ++ ;
		
		prop.setProperty("time", countNums+"");
		
		FileOutputStream fos = new FileOutputStream(countfile);
		
		prop.store(fos, "");
		
		fis.close();
		fos.close();
		
		
		
		
		
	}

}
