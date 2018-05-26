
public class GenaricDemo1 {

	public static void main(String[] args) {
		Demo <String> d1 = new Demo<String>();
		
		d1.coll("sadf");
		d1.print(1234);
		d1.show("asqwdvvcw");
		
	}

}

class Demo<T>{
	public  void show( T t ){
		System.out.println(t);
	}
	public <A> void coll(A s){
		System.out.println(s);
	}
	public static <Q> void print(Q q){
		System.out.println(q);
	}
	
}
/*class Student extends Person{

	public Student(String arg0, int arg1) {
		super(arg0, arg1);
	}
	
}*/
/*class Person{
	
	private String name;
	private int    age ;
	
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
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}*/
