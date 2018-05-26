package Java_io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class IO_OutputStreamWriter {

	public static void main(String[] args) {
		Testtransfer("c:\\users\\Steven\\Desktop\\233.txt",
				"c:\\users\\Steven\\Desktop\\23.txt");
	}
	@Test
	public static void Testtransfer(String scr, String dest){
//		创建读取与输入的文件类.
		File f1 = new File(scr);
		File f2 = new File(dest);
		
//		初始化BufferedReader and BufferedWriter.
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			//		编码
					FileInputStream fis = new FileInputStream(f1);
					InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
					br = new BufferedReader(isr);
					
			//		解码
					FileOutputStream  fos  = new FileOutputStream(f2);
					OutputStreamWriter osw = new OutputStreamWriter(fos);
				    bw = new BufferedWriter(osw);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
				
		String str ;
		
		try {
			while((str = br.readLine()) != null ){
			//	System.out.print(str+"\n");
				bw.write(str);
				bw.newLine();
				bw.flush();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			if(br != null){
				try {
				
					br.close();
				}
			 catch (IOException e) {
				e.printStackTrace();
			}
				
			}
			if(bw != null){
			try {
				
					bw.close();
				}
			 catch (IOException e) {
				e.printStackTrace();
			}
			
			}
		
		}
	}

}
