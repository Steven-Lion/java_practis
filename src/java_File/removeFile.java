package java_File;

import java.io.File;

public class removeFile {

	public static void main(String[] args) {
		File f = new File("D:\\����������2017");
		removeDir(f);
	}
//	�Ƴ��ļ��з���.
//	windowsɾ���ļ����Ǵ��ﵽ��ɾ����.
	public static void removeDir(File dir){
//		�ж�dir�Ƿ����
		if(dir.isDirectory()){
			
			File[] files = dir.listFiles();
			
//			ѭ�������ļ���������ļ��оͽ��벢ɾ���ļ�.
		for (int i = 0; i< files.length; i++) {
//				��ֹ���������ļ��е��·���ʧ��.
			if(!files[i].isHidden() && files[i].isDirectory()){
				removeDir(files[i]);
			}
			else{
				System.out.println("delete--file : " + files[i].getName()
									+"�Ƿ�ɾ���ɹ�: "+ files[i].delete());
			}
			
			}
			System.out.println("true?"+dir.delete());
		
		}
		else {
			
			System.out.println("�ļ��в�����.");
			
		}
		
		
	}

}
