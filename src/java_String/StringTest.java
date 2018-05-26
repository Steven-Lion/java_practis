package java_String;

/*
1，模拟一个trim方法，去除字符串两端的空格。
	思路：
	1，判断字符串第一个位置是否是空格，如果是继续向下判断，直到不是空格为止。
		结尾处判断空格也是如此。
	2，当开始和结尾都判断到不是空格时，就是要获取的字符串。



2，将一个字符串进行反转。将字符串中指定部分进行反转，"abcdefg";abfedcg
	思路：
	1，曾经学习过对数组的元素进行反转。
	2，将字符串变成数组，对数组反转。
	3，将反转后的数组变成字符串。
	4，只要将或反转的部分的开始和结束位置作为参数传递即可。


*/

class StringTest 
{

	
	public static void sop(String str)
	{
		System.out.println(str);
	}
	public static void tradition(String str){
		char[] c1 = str.toCharArray();
		for (int i 	= c1.length-1; i > 0; i--) {
			System.out.print(c1[i]);
			
		}System.out.println();
	}
	
	public static String delspace(String str){
		 int start = 0 ,end = str.length()-1;
		 String s = "      ab cd      ";//17
		 while(start <=end && str.charAt(start)==' '){
			 start++;//6
		 }
		 while(start <=end && str.charAt(end) == ' '){
			 
			 end--;//11

		 }
		
		return str.substring(start, end+1);
		
	}
	public static void main(String[] args) 
	{
		String s = "      ab cd      ";
		String s1 =	"abcdefg";
		
		tradition(s1);
		
		System.out.println(delspace(s));
		
//		sop("("+s+")");
//		s = myTrim(s);
//		sop(s);
		

//		sop("("+reverseString(s)+")");
		
	}


	//练习二：将字符串反转。
	/*
	思路：
	1，将字符串变成数组。
	2，对数组反转。
	3，将数组变成字符串。
	*/

	public static String reverseString(String s,int start,int end)
	{
		//字符串变数组。
		char[] chs = s.toCharArray();

		//反转数组。
		reverse(chs,start,end);

		//将数组变成字符串。
		return new String(chs);
	}
	public static String reverseString(String s)
	{
		return reverseString(s,0,s.length());
		
	}

	private static void reverse(char[] arr,int x,int y)
	{
		for(int start=x,end=y-1; start<end ; start++,end--)
		{
			swap(arr,start,end);
		}
	}
	private static void swap(char[] arr,int x,int y)
	{
		char temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	//练习一，去除字符串两端空格。
	public static String myTrim(String str)
	{
		int start = 0,end = str.length()-1;

		while(start<=end && str.charAt(start)==' ')
			start++;

		while(start<=end && str.charAt(end)==' ')
			end--;

		return str.substring(start,end+1);
	}
}


