package java_Map;

import java.util.*;
public class TreeMaptest {
	
	public static void main(String[] args) {
		
		//放置比较器.
		TreeMap<Student,String> tm = new TreeMap<Student,String>(new stuComparatorName());
		
		tm.put(new Student("a李思源",11), "23");
		tm.put(new Student("c张子凡",10), "21");
		tm.put(new Student("b李星云",14), "24");
		tm.put(new Student("d不良帅",13), "28");
//		如果出现重发的key他就会自动覆盖
//		tm.put(new Student("d不良帅123",13), "28");
		
		//Set
		Set<Map.Entry<Student, String>>  set1 = tm.entrySet();
		
		//创建构造器
		Iterator<Map.Entry<Student, String>> it = set1.iterator();
		
		while(it.hasNext())
		{
//Map.Entry<Student, String> map_Entry = it.next(); 这个要记住.Map.Entry是关系.<>是对应关系.
			
			Map.Entry<Student, String> map_Entry = it.next();
			
			Student stu = map_Entry.getKey();
			
			String value = map_Entry.getValue();
			
			System.out.println(stu.getName()+ " : "+stu.getAge() + " --- "+ value);
		}
		
		}

}
class stuComparatorName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		int num = o1.getName().length() - o2.getName().length();
		
		if(num == 0){
			return o1.getName().compareTo(o2.getName());
		}
		return num;
	}

	
}
class Student implements Comparator<Student>{
	
	private String name;
	private int    age ;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	Student(String name ,int  age){
		this.name = name;
		this.age  =  age;
	}
	@Override
	public int compare(Student o1, Student o2) {
		
		int num = o1.getName().length() - o2.getName().length();
		
		int num2 = num == 0 ? o1.getName().compareTo(o2.getName()): num;
		
		int num3 = num2 ==0 ? o1.getAge()-o2.getAge() : num2   ;		
		
		return num3;
	}
	
}
