package Java_io;

import java.io.*;

public class testPrintWriterDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pw = new PrintWriter(new FileWriter("a2.txt"),true);
		
		String line = null	;
		
		while((line = bufr.readLine()) != null){
			
			if("over".equals(line)){
				break;
			}
			else{
				
				System.out.println(line.toUpperCase());
			}
			
		}
		
		bufr.close();
		pw.close();
	}

}
