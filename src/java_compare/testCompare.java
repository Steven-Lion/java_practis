package java_compare;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class testCompare {

	public static void main(String[] args) {
		//这种方法不用实现接口的方式实现某个类中的属性的排序.
//		定制排序：创建TreeSet 对象是，传入Comparator接口的实现类.
//		要求：Comparator 接口的compare方法的返回值和两个元素的equals（）方法具有一致的返回值.
		Comparator comparator = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Person && o2 instanceof Person) {
					Person p1 = (Person) o1 ;
					Person p2 = (Person) o2 ;
					return p1.getAge()- p2.getAge();
				}
				else {
					throw new ClassCastException("不能转为Person类");
				}
			}
			
		
	};	
	
	Set set2 = new TreeSet<>(comparator);
	
	set2.add(new Person("a1",23));
	set2.add(new Person("a2",14));
	set2.add(new Person("a3",26));
	set2.add(new Person("a4",31));
	
	for(Object obj :set2){
		System.out.println(obj);
	}
	
	
	
	}

}
