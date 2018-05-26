package java_extends;
/*
 * (2)定义类Kids1继承ManKind，
   并包括成员变量 int yearsOld；
方法 printAge() 打印 yearsOld 的值。
   (3)在Kids1类的main方法中实例化Kids1的对象 someKid，用该对象访问其父类的成员变量及方法。
 */
public class Kid1 extends ManKind{
	private int yearOld;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid1 someKid = new Kid1();
	}
	public void printAge(){
		System.out.println("yearOld:"+ yearOld);
	}
	

}
