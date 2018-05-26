package java_File;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//	将一个指定文件夹中的文件列表打印到一个文本文件中.
/*
 * 	思路.
 * 	将所指定的文件夹进行遍历递归.
 * 	得到文件夹的所在路径和名字并且存入集合中.
 * 	将集合中的元素打印到文本中.
 * 
 */

public class fileListWriter {
	
	public static void main(String[] args) throws IOException {
		File dir = new File("G:\\QQ");
		List<File> filelist = new ArrayList<File>();
		
		showDir(dir,filelist,".exe");
		
		File f2 = new File(dir,"loglist.txt");
		writetofile(filelist, f2.toString());
		System.out.println("done");
	}
	
//	循环递归指定的文件夹.
	public static void showDir(File dir ,List<File> filelist,String endWord){
		
		File[] files = dir.listFiles();
		
		for(File f : files){
			
			if (f.isDirectory()) {
					showDir(f,filelist,endWord);
			}
			else{
				
				 if(f.getName().endsWith(endWord)){
					 
					 filelist.add(f);
					 
				 }
			}
			
		}
		
	}
	
//	将上述的filelist写入logPath.txt文本中
	
	public static void writetofile(List<File> fileslist, String javaListFile) throws IOException
	{
		
		BufferedWriter bw = null;
		
		try {
			
			bw = new BufferedWriter(new FileWriter(javaListFile));
			
			for(File f : fileslist){
				
				String path = f.getAbsolutePath();
				
				bw.write(path);
				bw.newLine();
				bw.flush();
				
				
			}
			
			
		} catch (IOException e) {
			throw e;
		}
		finally{
			try {
				if(bw != null){
					bw.close();
				}
			} catch (IOException e) {
				throw e;
			}
		}
		
	}
	
	

}
