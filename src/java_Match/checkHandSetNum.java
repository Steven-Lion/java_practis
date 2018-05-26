package java_Match;

public class checkHandSetNum {

	public static void main(String[] args) {
		String telephone1 = "12345678910";
		String telephone2 = "15045678910";
		System.out.println(check(telephone1));
		System.out.println(check(telephone2));
		
	}
	public static String check(String str) {
		
		String regex = "1[3,5,8]\\d{9}$";
		if(str.matches(regex)) {
			return str+"is phone numbers";
		}
		else {
			return str+"is not phone numbers";
		}
	}

}
