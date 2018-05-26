package java_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * List ����һ��Ԫ�������ҿ��ظ��ļ��ϣ������е�ÿ��Ԫ�ض������Ӧ��˳������
 * List ����ʹ���ظ�Ԫ�أ�����ͨ������������ָ��λ�õļ���Ԫ�ء�
 * List Ĭ�ϰ�Ԫ�ص����˳������Ԫ�ص�������
 * List �����������һЩ������������������Ԫ�صķ���
 * void add(int index, Object ele)ָ��λ��,����object��.
 * boolean addAll(int index, Collection eles)ָ��λ����Ӽ���Collection��.
 * Object get(int index)  �õ��������object�����.
 * int indexOf(Object obj) ����һ��ָ�����ַ���ֵ�ʼ���ֵ�λ��
 * int lastIndexOf(Object obj)����һ��ָ�����ַ���ֵ�����ֵ�λ��
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
		
//		list�ĳ���.
		System.out.println(list.size());
		
//		list.add(2,new Person("VV",16));
//		System.out.println(list.indexOf(new Person("BB",11)));
		
//		Object remove(int index)
//		list.remove(0);
		
		ArrayList list1 = new ArrayList();
		
//		��Ӽ��ϵ�list1��.
		list1.addAll(list);
		
//		void add(int index, Object ele)
//		list.set(2, new Person("II",44));
		
//		ʹ��ListIterator���б���.
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
