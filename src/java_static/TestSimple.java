package java_static;

public class TestSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple s1 = Simple.onlyone;
		Simple s2 = Simple.onlyone;
		if(s1.equals(s2)){
			 double pi=Math.PI;
			System.out.println("Pi = "+pi);
		}
	}

}
