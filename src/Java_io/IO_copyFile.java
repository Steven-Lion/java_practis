package Java_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO_copyFile {

	public static void main(String[] args) {
		
		IO_copyFile copy1 = new IO_copyFile();
		long start = System.currentTimeMillis();
		
		copy1.copyFile("C:/Users/Steven/Desktop/蓝屏代码查询器.exe", 
				"C:/Users/Steven/Desktop/蓝器.exe");
		long end = System.currentTimeMillis();
		System.out.println("所用时间为:" + (end-start));
		
		
	}
	
	
	
	public void copyFile(String src ,String dest){
		//src起始位置和拷贝位置dest.
		
//		1.提供读取和写入的文件.
		File f1 = new File(src);
		File f2 = new File(dest);
//		2.提供相对应的流.
		
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
//		3.实现复制&创造具体数组.
		byte[] b = new byte[1024];
		
		int len;
		try {
			while((len = fis.read(b))!= -1){
//				正确写法开始写入.
				fos.write(b, 0, len);
				
				//错误写法.
//				fos.write(b,0,b.lenth);
//				or 
//				fos.write(b);两者是一样的.
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//关闭所有流.
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
