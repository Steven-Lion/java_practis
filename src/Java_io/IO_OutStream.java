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
		
//		创建一个File对象.
		File file1 = new File("hello2.txt");
//		创建一个FileOutputStream类的对象用于传递File的形参.
		FileOutputStream output = new FileOutputStream(file1);
//		写入数据.
		try {
			output.write(new String("高中理事长.干死!").getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
//		关闭写入流.
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
