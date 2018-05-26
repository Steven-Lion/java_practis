package java_Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws Exception, IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("student.txt"));
//		student.txt 这个文件是给jvm看的 一般是乱码.
		
		oos.writeObject(new Students("大宝",29,"007"));
		
		oos.flush();
		
		oos.close();
		
		
	}

}
