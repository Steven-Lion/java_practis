package java_overload;
/*1)定义Person类,有4个属性：String name; int age; String school; String major，
	(2)定义Person类的3个构造方法:
		第一个构造方法Person(String n, int a)设置类的name和age属性；
		第二个构造方法Person(String n, int a, String s)设置类的name,   
        age 和school属性；
		第三个构造方法Person(String n, int a, String s, String m)设置类的name, age ,school和major属性；
	(3)在main方法中分别调用不同的构造方法创建的对象，并输出其属性值
	*/
public class Person1 {
    private String name ;
    private int age;
    private String School;
    private String major;
	
    public static void main(String[] args) {
		Person1 p2 = new Person1();
		p2.Person("小明", 13);
		p2.Person("小明", 13,"北京大学");
		p2.Person("小明", 13,"北京大学","物联网");
	}

    public void Person(String n,int a){
    	
    	this.name = n;
    	this.age = a;
    	System.out.println("名字："+name+"年龄："+age);
    }
    public void Person(String n,int a,String s){
    
      this.name = n;
      this.age = a;
      this.School = s;
      System.out.println("名字："+name+"年龄："+age+"学校"+School);
    }
    public void Person(String n, int a,String s,String m){
    	this.name = n;
    	this.School = s;
    	this.major = m;
    	this.age = a;
    	 System.out.println("名字："+name+"年龄："+age+"学校"+School+"专业:"+major);
    }
}
