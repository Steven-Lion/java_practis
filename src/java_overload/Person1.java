package java_overload;
/*1)����Person��,��4�����ԣ�String name; int age; String school; String major��
	(2)����Person���3�����췽��:
		��һ�����췽��Person(String n, int a)�������name��age���ԣ�
		�ڶ������췽��Person(String n, int a, String s)�������name,   
        age ��school���ԣ�
		���������췽��Person(String n, int a, String s, String m)�������name, age ,school��major���ԣ�
	(3)��main�����зֱ���ò�ͬ�Ĺ��췽�������Ķ��󣬲����������ֵ
	*/
public class Person1 {
    private String name ;
    private int age;
    private String School;
    private String major;
	
    public static void main(String[] args) {
		Person1 p2 = new Person1();
		p2.Person("С��", 13);
		p2.Person("С��", 13,"������ѧ");
		p2.Person("С��", 13,"������ѧ","������");
	}

    public void Person(String n,int a){
    	
    	this.name = n;
    	this.age = a;
    	System.out.println("���֣�"+name+"���䣺"+age);
    }
    public void Person(String n,int a,String s){
    
      this.name = n;
      this.age = a;
      this.School = s;
      System.out.println("���֣�"+name+"���䣺"+age+"ѧУ"+School);
    }
    public void Person(String n, int a,String s,String m){
    	this.name = n;
    	this.School = s;
    	this.major = m;
    	this.age = a;
    	 System.out.println("���֣�"+name+"���䣺"+age+"ѧУ"+School+"רҵ:"+major);
    }
}
