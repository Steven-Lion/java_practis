
public class GenericDemo2 {

	public static void main(String[] args) {
		inter1<String> t1 = new inter1<String>();
		
		t1.method("method:777");
	}

}

class inter1<T> implements Inter<T>	{
	public void method(T t){
		System.out.println(t);
	}
}


interface Inter<T>{
	
	void method(T t);
	
}
