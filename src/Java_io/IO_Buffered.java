package Java_io;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class IO_Buffered {

	public static void main(String[] args) {
		IO_Buffered io = new IO_Buffered();
		
		io.Bufferedtest("c:\\users\\Steven\\Desktop\\123.png",
				 		"c:\\users\\Steven\\Desktop\\1.png  ");
	
	}
	
	@Test
	public  void Bufferedtest (String scr,String dest){
//		创建读入和写入的文件.
		File scr1 = new File(scr);
		File dest1 = new File(dest);
		
//		创建FileInputStream和FileOutputStream.并将上面两个文件作为形参传入进去.
		FileInputStream fis = null;
		FileOutputStream fos= null;
		try {
			fis = new FileInputStream(scr1);
			fos = new FileOutputStream(dest1);

		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		使用BufferedInputStream和BufferedOutputStream，并用fis和fos作为形参传入进去.
		BufferedInputStream Bfis = new BufferedInputStream(fis);
		BufferedOutputStream Bfos = new BufferedOutputStream(fos);
//		开始复制文件.
		byte[] b = new byte[1024];
		int len;
		try {
			while((len = Bfis.read(b)) != -1){
				
				Bfos.write(b,0,len);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		关闭相对应的流.
		finally{
		try {
			Bfis.close();
		
			Bfos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}
	
	
}
