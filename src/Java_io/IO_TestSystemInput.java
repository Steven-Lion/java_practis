package Java_io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class IO_TestSystemInput {

	public static void main(String[] args) {
		
		BufferedReader bis = null;
		try {
			InputStream in = System.in;
			
			System.out.println("Pleace input what you want Output!");
			
			System.out.println("input 'e' or 'exit' will be END");
			
			InputStreamReader isr = new InputStreamReader(in);
			
			bis = new BufferedReader(isr);
			
			String str;
			
			while(true){
				str = bis.readLine();
				
				if(		str.equalsIgnoreCase("e")
						||str.equalsIgnoreCase("exit")
						||str.equalsIgnoreCase("E"))
				{
					break;
					
				}
				
				String str1 = str.toUpperCase();
				
				System.out.println(str1);
				
				
			}
			System.out.println("End");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			bis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
