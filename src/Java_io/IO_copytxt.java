package Java_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class IO_copytxt {

	public static void main(String[] args) {
		
//		�����ı��ļ�����FileReader��FileWriter .
//		������ı��ļ�����ƵͼƬ����ļ�ʹ���ֽ���. FileInputStream/FileOutputStream.
		
		/*File ftxt = new File("c:\\users\\Steven\\Desktop\\233.txt");
		
		FileReader freader = null;
		try {
			freader = new FileReader(ftxt);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
//		ÿ��ȡ�����ַ�.
		char[] b = new char[24];
		
		int len;
		
		try {
			while((len = freader.read(b))!= -1){
				String str = new String(b,0,len);
				System.out.print(str);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {if(ftxt != null)
				freader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		Filecopy("c:\\users\\Steven\\Desktop\\233.txt",
				"c:\\users\\Steven\\Desktop\\23.txt"); 
		
	}
	@Test
	public static void Filecopy(String scr, String gost){
		
		File scr1 = new File(scr);
		File gost1 = new File(gost);
		
		FileReader f_reader = null;
		FileWriter f_writer = null;
		
		try {
			f_reader  = new FileReader(scr1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			f_writer  = new FileWriter(gost1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		char[] char1 = new char[24];
		int len;
		try {
			while((len = f_reader.read(char1)) != -1){
				f_writer.write(char1, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				f_reader.close();
				f_writer.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
