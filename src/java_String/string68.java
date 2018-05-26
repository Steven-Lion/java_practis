package java_String;

public class string68 {

	public static void main(String[] args) {
		String str = "i love you ooo";
		System.out.println(string_count(str,'o'));

	}
	private static int string_count(String str,char value) {
			char[] chars = str.toCharArray();
			int count = 0;
			for (int i = 0; i < chars.length; i++) {
						if(value == chars[i]) {
							count++;
						}
					
				
			}
			return count;
	}

}
