package java_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * List 代表一个元素有序、且可重复的集合，集合中的每个元素都有其对应的顺序索引
 * List 允许使用重复元素，可以通过索引来访问指定位置的集合元素。
 * List 默认按元素的添加顺序设置元素的索引。
 * List 集合里添加了一些根据索引来操作集合元素的方法
 * void add(int index, Object ele)指定位置,放置object类.
 * boolean addAll(int index, Collection eles)指定位置添加集合Collection类.
 * Object get(int index)  得到括号里的object类对象.
 * int indexOf(Object obj) 返回一个指定的字符串值最开始出现的位置
 * int lastIndexOf(Object obj)返回一个指定的字符串值最后出现的位置
 * Object remove(int index)
 * Object set(int index, Object ele)
 * List subList(int fromIndex, int toIndex)
 */
public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new Person("AA",13));
		list.add(new Person("BB",11));
		list.add(new Person("CC",24));
		list.add(new Person("DD",31));
		list.add(new Person("BB",11));
		list.add(new Person("ff",22));
		
//		list的长度.
		System.out.println(list.size());
		
//		list.add(2,new Person("VV",16));
//		System.out.println(list.indexOf(new Person("BB",11)));
		
//		Object remove(int index)
//		list.remove(0);
		
		ArrayList list1 = new ArrayList();
		
//		添加集合到list1中.
		list1.addAll(list);
		
//		void add(int index, Object ele)
//		list.set(2, new Person("II",44));
		
//		使用ListIterator进行遍历.
		ListIterator lit =list.listIterator();
		
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		
//		Object get(int index)
//		for(int i = 0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		
//		int indexOf(Object obj)
//		System.out.println(list.indexOf(new Person("ff",22 )));

//		int lastIndexOf(Object obj)
		System.out.println(list1.indexOf(new Person("BB",11)));
			
//		List subList(int fromIndex, int toIndex)
//		System.out.println(list.subList(1, 3));
		
	}

}
