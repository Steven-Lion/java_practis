package java_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import java_compare.Person;

public class TestSet {
	/*
	 * 1.Set ��collection���ӽӿ�.
	 * 2.Set �в���������ͬ��Ԫ��,�ж���׼��equals()	����������true.
	 * 3.HashSet
	 * 4.1HashSet�Ļ�������.
	 * 
	 * 5.LindedhashSet��HashSet������.
	 * 	�������ظ�.
	 */
		public static void main(String[] args) {
		
		 Set set = new HashSet();
		//���Է�null;
		 set.add(null);
		
		 System.out.println(set.size());//1
		 
		 Person p1 = new Person("xiao",13);
		 Person p2 = new Person("xion",13);
		 
		 set.add(p1);
		 set.add(p1);
		 
		 //equals����true;
		 
		 System.out.println(set.size());//2
		 
		 set.add(new Person("AA",14));
		 set.add(new Person("AA",14));
		 
		 //equals����true��
		 
		 System.out.println(set.size());//3
		 
		 Iterator it = set.iterator();
		 while (it.hasNext()) {
			 System.out.println(it.next());
	}
	
		}	
}
