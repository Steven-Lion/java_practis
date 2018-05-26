package Java_LinkedList;

import java.util.LinkedList;

public class LinkedListtest1 {
	
	public static void main(String[] args) {
			
			Duilei d = new Duilei();
			
			d.myAdd("java1");
			d.myAdd("java2");
			d.myAdd("java3");
			d.myAdd("java4");
			
			while(!d.isNull()){
				System.out.println(d.myGet());
			}
	}
}

class Duilei{
	private LinkedList link;
	
	Duilei(){
		
		link = new LinkedList();
		
	}
	
	public void myAdd(Object obj){
		
		link.addLast(obj);
		
	}
	public Object myGet(){
		
		return link.removeFirst();
		
	}
	public boolean isNull(){
		
		return link.isEmpty();
		
	}
	
}
