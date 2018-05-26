package java_String;

import java.util.StringTokenizer;

public class string56 {

	public static void main(String[] args) {
			str1();

	}

	public static void str1() {
		String text = " we are the winner!";
		text = text.replaceAll(" ","");
		System.out.println(text);
		
	}
	
	public static void str() {
		String text = " we are the winner!";
		System.out.println("old String\n"+text);

		StringTokenizer st = new StringTokenizer(text," ");
		
		StringBuffer sb = new StringBuffer();
		
		int i = 1;
		while(st.hasMoreTokens()) {
			
			i++;
			sb.append(st.nextToken());
			
		}

		System.out.println("new String\n"+sb.toString());

		}
}
