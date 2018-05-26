package java_File;

import java.io.File;
import java.io.FilenameFilter;

public class FileListDemo {
	public static void main(String[] args) {
		File f = new File("d:\\codecs");
		showdir(f,0);
	}
//	��ӡ�㼶��ϵ�ķ���.
	public static String getlevel(int level){
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < level ;i++	){
			sb.append("     ");
			
		}
		sb.insert(0, "|    ");
		return sb.toString();
	}
	
	
	public static void showdir(File dir ,int level){
//		�õ�ѭ��Ŀ¼��·��.
		File[] f1 = dir.listFiles();
		
//		�����ݼ�.
		level++;
		
//		ѭ���ж��Ƿ����ļ�
		for (int i = 0; i < f1.length; i++) {
//			�����Directory�ͽ�����Ŀ¼�м�����ӡ
			if(f1[i].isDirectory()){
//				���õݹ���ѭ��������Ŀ¼.
				showdir(f1[i],level);
			}
//			������ļ��ʹ�ӡ������.
			else{
				System.out.println(getlevel(level)+f1[i].getName());
			}
		}
		
		/*for(File fi : f1){
			show(fi);
		}*/
	}
	public static void show(Object obj){
		System.out.println(obj);
		
	}
	

}
