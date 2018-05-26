package java_Exception;

public class myexception extends Exception{
	private int idnumber;
	public  myexception(String message,int id){
		super(message);
		this.idnumber = id;
	}
	public int getid(){
		return idnumber;
	}
}
