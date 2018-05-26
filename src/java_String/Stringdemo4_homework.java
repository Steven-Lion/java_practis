package java_String;

import java.util.Arrays;


/*
 * 	作业：
 *  "12 0 99 -7 30 4 100 13"
 *  要求对字符串中的数值进行排序。生成一个数值从小到大新字符串。
 *	"-7 0 4 12 13 30 99 100"
 *
 */
public class Stringdemo4_homework {

	private static String Stringsort2(String str){

//		将字符串分割为字符串数组
		String[] strArray = str.split(" ");
		
//		创建接收Int数组.
		int[] getArray = new int[strArray.length];

//		将每一个数组中的字符转化为基本数据Int类型
		for (int i = 0; i < strArray.length; i++) {
			
			getArray[i] = Integer.parseInt(strArray[i]);
		
		}
		

//		对getArray数组中的数据进行排序.
		
		Arrays.sort(getArray);

//	使用ingBuilder进行储存.		
		
		StringBuilder b1 = new StringBuilder();

		for (int i = 0; i < getArray.length; i++) {
			
			b1.append(getArray[i]).append(" ");
			
		}
//	返回新的String.		
		return b1.toString();
	}
	public static void main(String[] args) {
		
		String c1 =	"12 0 99 -7 30 4 100 13";
		
		Stringdemo4_homework sh = new Stringdemo4_homework();
		
		System.out.println(Stringdemo4_homework.Stringsort2(c1));
		
	}

}
