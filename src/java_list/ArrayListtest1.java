package java_list;

import java.util.*;
//1.�Դ���Collections�е�sort��������.

public class ArrayListtest1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("jjjjj");
		list.add("aaa");
		list.add("bb");
		
		list.add("fff");
		
		list.add("ccccc");
		list.add("qqqqqq");
		
		System.out.print("û����֮ǰ:");sop(list);
		
		Collections.sort(list,new String_sort());
	
		System.out.print("����֮��:");sop(list);
		
		
	}
	
	
	public static void sop(Object obj){
		System.out.println(obj);
	}

	

}

//дһ���Ƚ����������ճ���������.
class String_sort<String> implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		int num =str1.toString().length() - str2.toString().length();
		
		int num2 = num == 0 ? str1.toString().compareTo(str2.toString()): num;
		
		return num2;
	}
	
}



