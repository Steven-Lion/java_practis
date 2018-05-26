package java_set;

import java.util.Set;
import java.util.TreeSet;

public class TestFree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set = new TreeSet();
		
//		set.add("123");
//		set.add("321");
		
	
		set.add(new Student("AA",9));
		set.add(new Student("BB",8));
		set.add(new Student("CC",5)); 
		set.add(new Student("DD",1));
		
		System.out.println(set.size());
		
		for (Object obj : set){
			
			System.out.println(obj);
			
		}
		
		
		
		
		
		
		
		
	}

}
