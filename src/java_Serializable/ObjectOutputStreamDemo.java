package java_Serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws Exception, IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("student.txt"));
//		student.txt ����ļ��Ǹ�jvm���� һ��������.
		
		oos.writeObject(new Students("��",29,"007"));
		
		oos.flush();
		
		oos.close();
		
		
	}

}
