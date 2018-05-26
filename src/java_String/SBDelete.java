package java_String;


public class SBDelete {

	public static void main(String[] args) {
		System.out.println(str1("this  test test"));

	}
	public static String str1(String str) {
			StringBuffer sbstr = new StringBuffer(str);
			for (int i = 0; i < sbstr.length(); i++) {
					for (int j = i+1; j <sbstr.length(); j++) {
							if(sbstr.charAt(i) == sbstr.charAt(j)) {
								sbstr.deleteCharAt(j);
							}
					}
			}
		return sbstr.toString();
	}

}
