package java_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class ArrayList1 {
	
	public static void main(String[] args) {
			ArrayList al = new ArrayList();
			al.add("java01");
			al.add("java02");
			al.add("java03");
			al.add("java01");
			al.add("java02");
			al.add("java03");
			
			sop(al);
			
			al = con_e(al);
			
			sop(al);
			
	}
	
	
	public static ArrayList con_e(ArrayList al){
		//����һ����ʱArrayList.
		ArrayList newAl = new ArrayList();
		
//		�����ȴ���.
		for (Iterator it = al.iterator(); it.hasNext();) {
			
			Object obj = it.next();
			
			if(!newAl.contains(obj)){
				newAl.add(obj);
			}
		}
		return newAl;
	}
	
	public static void sop(Object obj){
		System.out.println(obj);
	}
}