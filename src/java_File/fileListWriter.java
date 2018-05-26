package java_File;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//	��һ��ָ���ļ����е��ļ��б��ӡ��һ���ı��ļ���.
/*
 * 	˼·.
 * 	����ָ�����ļ��н��б����ݹ�.
 * 	�õ��ļ��е�����·�������ֲ��Ҵ��뼯����.
 * 	�������е�Ԫ�ش�ӡ���ı���.
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
	
//	ѭ���ݹ�ָ�����ļ���.
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
	
//	��������filelistд��logPath.txt�ı���
	
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
