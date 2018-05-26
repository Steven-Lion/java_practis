package Java_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class IO_test2 {

	public static void main(String[] args) throws IOException {
		
		
			/*//创建一个FileInputStream类的对象.
			FileInputStream file_Input = null;
			try {//使用try-catch来捕获异常保证了流最终可以关闭.
			//创建一个文件类的对象.
			File file1= new File("helloworld.txt");
			
			file_Input = new FileInputStream(file1);
			
			//调用FileInputStream的方法来,读取文件内容.
			int b ;
			while((b = file_Input.read())!= -1){
				System.out.print((char)b);
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally{
			//关闭相对应的流.
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
		//关闭流.
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
