package java_String;

import java.util.Arrays;


/*
 * 	��ҵ��
 *  "12 0 99 -7 30 4 100 13"
 *  Ҫ����ַ����е���ֵ������������һ����ֵ��С�������ַ�����
 *	"-7 0 4 12 13 30 99 100"
 *
 */
public class Stringdemo4_homework {

	private static String Stringsort2(String str){

//		���ַ����ָ�Ϊ�ַ�������
		String[] strArray = str.split(" ");
		
//		��������Int����.
		int[] getArray = new int[strArray.length];

//		��ÿһ�������е��ַ�ת��Ϊ��������Int����
		for (int i = 0; i < strArray.length; i++) {
			
			getArray[i] = Integer.parseInt(strArray[i]);
		
		}
		

//		��getArray�����е����ݽ�������.
		
		Arrays.sort(getArray);

//	ʹ��ingBuilder���д���.		
		
		StringBuilder b1 = new StringBuilder();

		for (int i = 0; i < getArray.length; i++) {
			
			b1.append(getArray[i]).append(" ");
			
		}
//	�����µ�String.		
		return b1.toString();
	}
	public static void main(String[] args) {
		
		String c1 =	"12 0 99 -7 30 4 100 13";
		
		Stringdemo4_homework sh = new Stringdemo4_homework();
		
		System.out.println(Stringdemo4_homework.Stringsort2(c1));
		
	}

}
