
public class ParamMethodDemo1 {

	public static void main(String[] args) {
		show(1,2,3);
		
	}
	public static void show(int... arr){
		System.out.println(arr.length); 
		
	}

}
