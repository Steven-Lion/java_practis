package java_String;

public class EncryptUncrpt {
	//¼ÓÃÜ×Ö·û´®ºÍ½âÃÜ.
	public static void main(String[] args) {
		String str = "i love you";
		char secret = 'L';
		String Encrypt_string = EandU(str,secret);
		System.out.println(Encrypt_string);
		String Uncrypt_string = EandU(Encrypt_string,secret);
		System.out.println(Uncrypt_string);
	}
	protected static String EandU(String value,char secret) {
			byte[] bt = value.getBytes();
			for (int i = 0; i < bt.length; i++) {
				bt[i]=(byte)(bt[i] ^ (int)secret);
			}
			return new String(bt,0,bt.length);
	}

}
