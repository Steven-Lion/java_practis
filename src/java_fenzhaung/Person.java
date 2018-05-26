package java_fenzhaung;
/*
 * 1.创建程序,在其中定义两个类，Person和
       	TestPerson类的定义如下。用setAge()设置人的合法年龄(0~130)，
       	用getAge()返回人的年龄。在Test类中实例化Person类的对象b，
       	调用setAge()和getAge()方法，体会Java的封装性。
 */
public class Person {
	private int age ;
	
	public Person(){
	
	}
	
	public void setage(int age){
			this.age = age;
		}
	public int getage(){
		
		return age;
	}
}