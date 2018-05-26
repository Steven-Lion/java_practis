package java_TreeSet;

import java.util.*;


//TreeSet如何保证唯一性.
//底层数据结构是二叉树.
public class treeSetTest1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		ts.add(new Student("java1",15) );
		ts.add(new Student("java2",13) );
		ts.add(new Student("java3",12) );
		ts.add(new Student("java4",11) );
		
		
		
		
			
		
		
		for(Iterator it1 = ts.iterator();it1.hasNext();){
			
			Student st1 = (Student)it1.next();
			
			System.out.println(st1.getName()+"年龄:"+st1.getAge());
		}
	
		
	}	
	
	

}

class Student implements Comparable{
	
	private String name ;
	private int    age	;
	
	Student(String name ,int age){
		
		this.name = name;
		this.age  = age ;
		
	}
	public void setName(String name){
		
		this.name = name ;
		
	}
	public void setAge(int age){
		
		this.age  = age	;
		
	}
	public String getName(){

		return this.name;
		
	}
	public int   getAge(){
		return this.age ;
	}
	@Override
	public int compareTo(Object obj) {
		
		if(!(obj instanceof Student)){
			
			throw new RuntimeException("这不是一个学生类.");
			
		}
		Student stu = (Student)obj;
		
		System.out.println(stu.age + "---"+ age);
		
		if(stu.age>age){
			return 1;
		}
		else if(stu.age == age)
			
		return  this.name.compareTo(stu.name);
		
		return -1;
	}
	
}
