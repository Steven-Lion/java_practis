package java_Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

	public static void main(String[] args) throws Exception {
//		可能文件不存在所以 要不捕获异常，要不抛出异常.
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
		
		Students stu = (Students)(ois.readObject());
		
		System.out.println(stu);
		
		ois.close();
	}

}
