package java_list;

import java.util.*;
//1.自带的Collections中的sort升序排序.

public class ArrayListtest1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("jjjjj");
		list.add("aaa");
		list.add("bb");
		
		list.add("fff");
		
		list.add("ccccc");
		list.add("qqqqqq");
		
		System.out.print("没排序之前:");sop(list);
		
		Collections.sort(list,new String_sort());
	
		System.out.print("排序之后:");sop(list);
		
		
	}
	
	
	public static void sop(Object obj){
		System.out.println(obj);
	}

	

}

//写一个比较器用来按照长度来排序.
class String_sort<String> implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		int num =str1.toString().length() - str2.toString().length();
		
		int num2 = num == 0 ? str1.toString().compareTo(str2.toString()): num;
		
		return num2;
	}
	
}



