package java_log;

import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class logtest {	
	
	public static void main(String[] args) throws IOException {
		
		try {
			int[] arr = new int[2];
			System.out.println(arr[3]);
		} catch (Exception e) {
			try {
				Date d = new Date();
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy��-mm��-dd��   HH:ss:mm");
				
				String s = sdf.format(d);
				
				PrintStream ps = new PrintStream("exeception.log");
				
				ps.println(s);
				
				System.setOut(ps);
				
			} catch (Exception ex) {
				
				throw new RuntimeException("��־�ļ�����ʧ��.");
				
			}
			e.printStackTrace(System.out);
		}
	}
		
}
