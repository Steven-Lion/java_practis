package Java_io;
import java.io.*;

class  PrintStreamDemo
{
	public static void main(String[] args) throws IOException
	{
//		main1();
		System.out.println("just");
	}
	
	public static void main1 ()throws IOException{
	BufferedReader bufr = new BufferedReader(new InputStreamReader (System.in));
		
		PrintWriter out = new PrintWriter(new FileWriter("a.txt"), true);
		
		String line = null;
		
		while((line = bufr.readLine()) != null){
			if("over".equals(line)){
				break;
			}
			out.println(line.toUpperCase());
			
		}
		bufr.close();
		out.close();
	}
	
	
	

}
/*
 * 打印流：
 * 该流提供了打印方法，可以将各种数据类型的数据都鸳鸯打印.
 * 
 * 字节打印流：
 * PrintStream
 * 构造函数可以接受的参数类型：
 * 1.file对象.File
 * 2.字符串路径.String
 * 3.字节输出流.OutputStream
 *
 * 字符打印流：
 * PrintWriter
 * 构造函数可以接收的参数类型：
 * 1，file对象。File
 * 2，字符串路径。String
 * 3，字节输出流。OutputStream
 * 4，字符输出流，Writer。
*/