package java_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import java_compare.Person;

public class TestSet {
	/*
	 * 1.Set 是collection的子接口.
	 * 2.Set 中不允许存放相同的元素,判定标准是equals()	方法，返回true.
	 * 3.HashSet
	 * 4.1HashSet的基本特征.
	 * 
	 * 5.LindedhashSet是HashSet的子类.
	 * 	不允许重复.
	 */
		public static void main(String[] args) {
		
		 Set set = new HashSet();
		//可以放null;
		 set.add(null);
		
		 System.out.println(set.size());//1
		 
		 Person p1 = new Person("xiao",13);
		 Person p2 = new Person("xion",13);
		 
		 set.add(p1);
		 set.add(p1);
		 
		 //equals返回true;
		 
		 System.out.println(set.size());//2
		 
		 set.add(new Person("AA",14));
		 set.add(new Person("AA",14));
		 
		 //equals返回true；
		 
		 System.out.println(set.size());//3
		 
		 Iterator it = set.iterator();
		 while (it.hasNext()) {
			 System.out.println(it.next());
	}
	
		}	
}
