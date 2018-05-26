package java_HashSet;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet h_Set = new HashSet();
		h_Set.add(new Person("java01",13));
		h_Set.add(new Person("java02",12));
		h_Set.add(new Person("java03",13));
		h_Set.add(new Person("java02",12));
//		h_Set.add(new Person("java03",13));
//		h_Set.add(new Person("java08",13));
		
		for (Iterator it = h_Set.iterator();it.hasNext();) {
			
			Person p = (Person)it.next();
			
			System.out.println(p.getName()+"---"+p.getAge());
		}
		
		
	}
	
	

}

class Person {
	private String name;
	private int age	   ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	Person(String name ,int age){
		
		this.name = name ;
		this.age  = age	 ;
		
	}
	
	public int hashCode() {
		
		return this.name.hashCode()*age;
	}

	public boolean equals(Object obj) {
		
		if(!(obj instanceof Person)){
			return false ;
		}
		
		Person p = (Person )obj	;
		
		return this.name.equals(p.getName()) && this.age == p.age;
	}
	
	/*
	public boolean equals(Object obj){
		
		
	}*/
	
	
	
}
