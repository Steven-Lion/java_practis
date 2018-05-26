package java_String;

public class reverse {
	//reverse()
	public static void main(String[] args) {
		EncryptUncrpt en = new EncryptUncrpt();
		String str= "hello world";
		StringBuffer sb = new StringBuffer(en.EandU(str, '1'));
		sb.reverse();
		System.out.println(sb);
		System.out.println(en.EandU(sb.reverse().toString(), '1'));
	}

}
