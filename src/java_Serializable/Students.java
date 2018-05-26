package java_Serializable;

import java.io.Serializable;

//			ʵ�����л�ʱ����ʵ��Serializable�ӿ�  �൱��һ����ǩ.
	
public class Students implements Serializable{	
	
	
	private String name ;
	
	private int age ;
	
	private transient String num	;
	
	public Students() {
		
	}
	
	public Students(String name ,int age, String num){
	
		this.name = name ;
		this.age = age ;
		this.num = num ;
		
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

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + ", num=" + num + "]";
	}
	
	
	
	
}
