package java_extends;
/*
 * 1.(1)定义一个ManKind类，包括
成员变量 int sex 和 int salary；
方法 void manOrWorman()：根据sex的值显示“man”(sex==1)或者“women”(sex==0)；
方法 void employeed()：根据salary的值显示“no job”(salary==0)或者“ job”(salary!=0)。
   (2)定义类Kids1继承ManKind，
   并包括成员变量 int yearsOld；
方法 printAge() 打印 yearsOld 的值。
   (3)在Kids1类的main方法中实例化Kids1的对象 someKid，用该对象访问其父类的成员变量及方法。

 */
public class ManKind {
	
	private int sex;
	private int salary;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void manOrWorman(){
		if(sex==1){
			System.out.println("this is a man");
		}
		else if (sex==0	){
			System.out.println("this is a women");
		}
	}
	
	public  void employeed(){
		if(salary==0){
			System.out.println("no job");
		}
		else if (salary!=0){
			System.out.println("job");
		}
	}
}
