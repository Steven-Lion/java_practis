package java_compare;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class testCompare {

	public static void main(String[] args) {
		//���ַ�������ʵ�ֽӿڵķ�ʽʵ��ĳ�����е����Ե�����.
//		�������򣺴���TreeSet �����ǣ�����Comparator�ӿڵ�ʵ����.
//		Ҫ��Comparator �ӿڵ�compare�����ķ���ֵ������Ԫ�ص�equals������������һ�µķ���ֵ.
		Comparator comparator = new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				if (o1 instanceof Person && o2 instanceof Person) {
					Person p1 = (Person) o1 ;
					Person p2 = (Person) o2 ;
					return p1.getAge()- p2.getAge();
				}
				else {
					throw new ClassCastException("����תΪPerson��");
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
