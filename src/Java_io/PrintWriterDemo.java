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
 * ��ӡ����
 * �����ṩ�˴�ӡ���������Խ������������͵����ݶ�ԧ���ӡ.
 * 
 * �ֽڴ�ӡ����
 * PrintStream
 * ���캯�����Խ��ܵĲ������ͣ�
 * 1.file����.File
 * 2.�ַ���·��.String
 * 3.�ֽ������.OutputStream
 *
 * �ַ���ӡ����
 * PrintWriter
 * ���캯�����Խ��յĲ������ͣ�
 * 1��file����File
 * 2���ַ���·����String
 * 3���ֽ��������OutputStream
 * 4���ַ��������Writer��
*/