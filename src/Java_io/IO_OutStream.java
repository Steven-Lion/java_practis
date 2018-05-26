package Java_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_OutStream {
	
	public static void main(String[] args) throws IOException {
		
		FileOutStream1();
	}
	
	public static void FileOutStream1() throws IOException{
		
//		����һ��File����.
		File file1 = new File("hello2.txt");
//		����һ��FileOutputStream��Ķ������ڴ���File���β�.
		FileOutputStream output = new FileOutputStream(file1);
//		д������.
		try {
			output.write(new String("�������³�.����!").getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
//		�ر�д����.
	 finally {
			if(file1 != null){
				try {
					output.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
	 }
		
		
		
	}
}
