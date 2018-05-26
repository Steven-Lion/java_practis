package java_overload;
/*2.定义三个重载方法max，
 * 第一个方法求两个int值中的最大值，
 * 第二个方法求两个double值中的最大值，
 * 第三个方法求三个double值中的最大值，
 * 并分别调用三个方法。
 */

	public class overLoad {
	
	public static void main(String[] args) {
		overLoad ov1 = new overLoad();
		ov1.mOL(3,7);
		ov1.mOL(2.2, 3.1);
		ov1.mOL(3.04,6.34,5.35);
	}
	
	public static void mOL(int a, int b){
		int max = Math.max(a, b);
		
		System.out.println("最大数是="+max);
	}
	
	public static void mOL(double a, double b){
		double max = Math.max(a, b);
		System.out.println("最大数是="+max);
	}
	
	public static void mOL(double a,double b,double c){
		double max1 = Math.max(a, b);
		double max2 = Math.max(max1, c);       
		System.out.println("最大数是="+max2);
	}
}
