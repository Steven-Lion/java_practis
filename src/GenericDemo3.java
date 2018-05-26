import java.util.*;	
class GenericDemo3{
	
		public static void main(String [] arg){
			//创建ArrayList.
			ArrayList<Person> al = new ArrayList<Person>();
			
			al.add(new Person("111111"));
			al.add(new Person("222222"));
			al.add(new Person("333333"));
			al.add(new Person("444444"));
			
			printcoll(al);
			
			ArrayList <Student> al1 = new ArrayList<Student>();
			
			al1.add(new Student("aaaaa"));
			al1.add(new Student("bbbbbb"));
			al1.add(new Student("cccccc"));
			al1.add(new Student("ddddddd"));
			
			printcoll(al1);
			

			
		}
		
	//输出方法.
		public static void printcoll(Collection<? extends Person> al){
			
			Iterator <? extends Person> it = al.iterator();
			
			while(it.hasNext()){
				System.out.println(it.next().getName());
			}
			
		}
		
}

class Student extends Person{

	Student(String name) {
		super(name);
	}
	
}

class Person {
	
	private String name;
	
	Person(String name){
		
		this.name = name;
		
	}
	public void setName(String name	){
		
		this.name = name;
		
	}
	public String getName(){
		return name;
	}
}