package java_TreeSet;

import java.util.*;

public class treeSettest2 {
	
	public static void main(String[] args) {
		TreeSet t2 = new TreeSet(new str_len_method());
		
		t2.add(new Student1("lisi01",12));
		t2.add(new Student1("lisi02",12));
		t2.add(new Student1("lisi03",12));
		t2.add(new Student1("lisi04",12));
		
	}
	
}
class str_len_method implements Comparator{

	public int compare(Object o1, Object o2) {
//		
		Student1 s1 = (Student1) o1;
		Student1 s2 = (Student1) o2;
		
//		比较字符长度.
		int num = s1.getName().length() - s2.getName().length();
//		比较字符是否相同.
		int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num ;
//		比较年龄是否相同.
		int num3 = num2 == 0 ? s1.getAge()-s2.getAge(): num2   ;
		
		return num3;
	}
	
}
class Student1 implements Comparable{
	
	private String name ;
	private int    age	;
	
	Student1(String name ,int age){
		
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
		
		System.out.println(stu.getAge() + "---"+ age);
		
		if(stu.getAge()>age){
			return 1;
		}
		else if(stu.getAge() == age)
			
		return  this.name.compareTo(stu.getName());
		
		return -1;
	}
	
}

