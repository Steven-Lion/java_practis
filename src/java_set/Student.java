package java_set;

public class Student implements Comparable {
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public int compareTo(Object o) {
		
		if(o instanceof Student){
			Student stu = (Student) o;
			System.out.println(this.score - stu.score);
			return this.name.compareTo(stu.name);
			
		}
		else {
			throw new ClassCastException("这不是一个Student对象.");
		}
		
	}
	
}
