package Java_io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_FileInputOutputStream {

	public static void main(String[] args) {
		
		
//		1.�ṩ��ȡ��д����ļ�.
		File f1 = new File("hello2.txt");
		File f2 = new File("hello3.txt");
//		2.�ṩ���Ӧ����.
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
				
		try {
			fis = new FileInputStream(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos =new FileOutputStream(f2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		3.ʵ�ָ���&�����������.
		byte[] b = new byte[20];
		
		int len;
		try {
			while((len = fis.read(b))!= -1){
//				��ȷд����ʼд��.
				fos.write(b, 0, len);
				
				//����д��.
//				fos.write(b,0,b.lenth);
//				or 
//				fos.write(b);������һ����.
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//�ر�������.
		finally{
			if(f1 != null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(f2 != null){
				try{
					fos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		
		  
	}

}
