package java_static;

public class Simple {
	public static Simple onlyone = new Simple();
	private String name;
	public static Simple getSimple(){
		return onlyone;
	}
	private Simple(){
		
	}
}
