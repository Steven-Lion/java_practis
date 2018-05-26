package java_ArrayList;
import java.util.*;
class ArrayList2{
		public static void main(String[] args) {
			ArrayList array1 = new ArrayList();
			
			array1.add(new Person("java01",11));
			array1.add(new Person("java01",11));
			array1.add(new Person("java03",13));
			array1.add(new Person("java02",12));
			array1.add(new Person("java03",13));
			array1.add(new Person("java04",13));
			
			array1 = simplePerson(array1);
			
			printPersonList(array1);
			
		}
		//removesameElements
		public static ArrayList simplePerson(ArrayList al){
			ArrayList newal = new ArrayList();
			
			for (Iterator it = al.iterator();it.hasNext();) {
				Person p = (Person)it.next();
				if(!newal.contains(p)){
					newal.add(p);
				}
			}
			return newal;
		}
		//printPersonlist
		public static ArrayList printPersonList(ArrayList al1){
			ArrayList personlist = new ArrayList();
			for (Iterator it1 = al1.iterator();it1.hasNext();) {
				Person p = (Person)it1.next();
				System.out.println(p.getName()+"---"+p.getAge());
			}
			return personlist;
		}
}

class Person{
	private String name ;
	
	private int age;
	Person(String name ,int age){
		this.name = name;
		this.age  = age	;
		
	}
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
	
	public boolean equals(Object obj){
		
		if(!(obj instanceof Person)){
			return false;
		}
			Person p = (Person)obj;
			
		return	this.name.equals(p.getName()) && this.age == p.age; 
				
				
	}
	
}