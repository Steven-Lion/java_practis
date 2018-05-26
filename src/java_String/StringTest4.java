package java_String;

import java.util.Arrays;

/*
对字符串中字符进行自然顺序排序。

思路：

1，字符串变成字符数组。

2，对数组排序，选择，冒泡，Arrays.sort();

3，将排序后的数组变成字符串。

"vcz1bdAa+cs"-->abccdsvz

作业：
"12 0 99 -7 30 4 100 13"
要求对字符串中的数值进行排序。生成一个数值从小到大新字符串。

"-7 0 4 12 13 30 99 100"


*/


class  StringTest4
{
	private static String stringSort(String str){
		//1把字符串变为字符数组.
	 char[] c =	str.toCharArray();
	 
	    //2对数组使用Array.sort方法进行排列.
	 Arrays.sort(c);
	
	
	 
	 	//3排序后的字符数组转化为String.
	 
	String b ="";
	
	 return  b.valueOf(c);
		 
		
	}
	
	
	
	public static void main(String[] args) 
	{	
		String s1 = "vczbdAa";
		
		 StringTest4 t4 = new StringTest4();
		 System.out.println("转换前:"+s1);
		System.out.println("转化后："+t4.stringSort(s1));
		 
	}
}
