package Java_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class IO_test2 {

	public static void main(String[] args) throws IOException {
		
		
			/*//����һ��FileInputStream��Ķ���.
			FileInputStream file_Input = null;
			try {//ʹ��try-catch�������쳣��֤�������տ��Թر�.
			//����һ���ļ���Ķ���.
			File file1= new File("helloworld.txt");
			
			file_Input = new FileInputStream(file1);
			
			//����FileInputStream�ķ�����,��ȡ�ļ�����.
			int b ;
			while((b = file_Input.read())!= -1){
				System.out.print((char)b);
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally{
			//�ر����Ӧ����.
			file_Input.close();
			}*/
		
		 FileInputStream2();
	}
	@Test
		public static void FileInputStream2() throws FileNotFoundException{
			
		FileInputStream inputStream = null;
		
		File file_Input1 = new File("helloworld.txt");

		inputStream = new FileInputStream(file_Input1);
		
		byte[] b1 = new byte[5];
		
		int len;
		try {
			while((len = inputStream.read(b1) )!= -1){
				for (int i = 0; i <len; i++) {
					System.out.print((char) b1[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//�ر���.
		try {
			if(file_Input1 != null){
			inputStream.close();
		}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
}
