package java_String;

import java.util.Arrays;

/*
���ַ������ַ�������Ȼ˳������

˼·��

1���ַ�������ַ����顣

2������������ѡ��ð�ݣ�Arrays.sort();

3�����������������ַ�����

"vcz1bdAa+cs"-->abccdsvz

��ҵ��
"12 0 99 -7 30 4 100 13"
Ҫ����ַ����е���ֵ������������һ����ֵ��С�������ַ�����

"-7 0 4 12 13 30 99 100"


*/


class  StringTest4
{
	private static String stringSort(String str){
		//1���ַ�����Ϊ�ַ�����.
	 char[] c =	str.toCharArray();
	 
	    //2������ʹ��Array.sort������������.
	 Arrays.sort(c);
	
	
	 
	 	//3�������ַ�����ת��ΪString.
	 
	String b ="";
	
	 return  b.valueOf(c);
		 
		
	}
	
	
	
	public static void main(String[] args) 
	{	
		String s1 = "vczbdAa";
		
		 StringTest4 t4 = new StringTest4();
		 System.out.println("ת��ǰ:"+s1);
		System.out.println("ת����"+t4.stringSort(s1));
		 
	}
}
