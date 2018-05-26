package java_equals;

import java_shuzu.MyDate;

/*
	 * 
	 */
public class Testeuqals {
	private int a ;
	private int b ;
	private int c ; 
	private static int total = 0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate m1 = new MyDate(14, 3, 1976);
		MyDate m2 = new MyDate(14, 3, 1976);
		
		System.out.println(total);
		
		Testeuqals.total = 100;
		
		System.out.println(total);
		
		if (m1 == m2) {
			System.out.println("m1 = m2");
		}
		else {
			System.out.println("m1 != m2");
		}
		
		if (m1.equals(m2)){
			System.out.println("m1 equals = m2");
		}
		else {
			System.out.println("m1 !equals m2");
		}
	}
	
	
	
	

}

	
