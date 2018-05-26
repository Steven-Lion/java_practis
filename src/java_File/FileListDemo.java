package java_File;

import java.io.File;
import java.io.FilenameFilter;

public class FileListDemo {
	public static void main(String[] args) {
		File f = new File("d:\\codecs");
		showdir(f,0);
	}
//	打印层级关系的方法.
	public static String getlevel(int level){
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < level ;i++	){
			sb.append("     ");
			
		}
		sb.insert(0, "|    ");
		return sb.toString();
	}
	
	
	public static void showdir(File dir ,int level){
//		得到循环目录的路径.
		File[] f1 = dir.listFiles();
		
//		层数递加.
		level++;
		
//		循环判读是否是文件
		for (int i = 0; i < f1.length; i++) {
//			如果是Directory就进入子目录中继续打印
			if(f1[i].isDirectory()){
//				利用递归来循环查找子目录.
				showdir(f1[i],level);
			}
//			如果是文件就打印出命名.
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
