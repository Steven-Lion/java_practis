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
//		���������д����ļ�.
		File scr1 = new File(scr);
		File dest1 = new File(dest);
		
//		����FileInputStream��FileOutputStream.�������������ļ���Ϊ�βδ����ȥ.
		FileInputStream fis = null;
		FileOutputStream fos= null;
		try {
			fis = new FileInputStream(scr1);
			fos = new FileOutputStream(dest1);

		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		ʹ��BufferedInputStream��BufferedOutputStream������fis��fos��Ϊ�βδ����ȥ.
		BufferedInputStream Bfis = new BufferedInputStream(fis);
		BufferedOutputStream Bfos = new BufferedOutputStream(fos);
//		��ʼ�����ļ�.
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
//		�ر����Ӧ����.
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
