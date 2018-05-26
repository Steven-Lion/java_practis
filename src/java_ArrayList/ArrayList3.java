package java_ArrayList;

import java.util.*;

//import java_set.Student;

public class ArrayList3  {

	public static void main(String[] args) {
		
		//ArrayList构造方法中没有创造Comparator接口的方法.
		TreeSet<String> al = new TreeSet<String>(new inf());
			
//		al.add(new Student("wds",13));
//		al.add(new Student("aaa",11));
//		al.add(new Student("bbb",12));
//		al.add(new Student("ccc",15));
		
		al.add("j");
		al.add("cc");
		
		al.add("bbbb");
		al.add("bbb1231b");
		al.add("bbasdfqwbb");
		al.add("fff");
		
		
		
		for(Iterator<String> it = al.iterator();it.hasNext();){
			String s = it.next();
			System.out.println(s);
		}
		System.out.println("--------");
		System.out.println("over");
		
	}

}

class inf implements Comparator<String>
{
	

	@Override
	public int compare(String o1, String o2) {
		
		/*int num = o1.getName().length() - o2.getName().length();
		
		int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
		
		int num3 = num2 == 0 ? o1.getScore()-o2.getScore() : num2    ;
		
		return num3;*/
		
//		int num = new Integer(o2.length()).compareTo(new Integer(o1.length()));
		int num = -(o2.length() - o1.length());
		
		if(num == 0){
			
			return o2.compareTo(o1);
			
		}
		return num;
	}
	
}
