package java_File;

import java.io.File;

public class removeFile {

	public static void main(String[] args) {
		File f = new File("D:\\垃圾云下载2017");
		removeDir(f);
	}
//	移除文件夹方法.
//	windows删除文件夹是从里到外删除的.
	public static void removeDir(File dir){
//		判读dir是否存在
		if(dir.isDirectory()){
			
			File[] files = dir.listFiles();
			
//			循环遍历文件夹如果是文件夹就进入并删除文件.
		for (int i = 0; i< files.length; i++) {
//				防止出现隐藏文件夹导致访问失败.
			if(!files[i].isHidden() && files[i].isDirectory()){
				removeDir(files[i]);
			}
			else{
				System.out.println("delete--file : " + files[i].getName()
									+"是否删除成功: "+ files[i].delete());
			}
			
			}
			System.out.println("true?"+dir.delete());
		
		}
		else {
			
			System.out.println("文件夹不存在.");
			
		}
		
		
	}

}
