import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class splitFile {

	public static void main(String[] args) throws IOException {
//		
		FileInputStream fis = new FileInputStream("H:\\2015学期电脑个人文件\\VID_20160527_120317.mp4");
		
		FileOutputStream fos = null ;
		
		int len = 0;
		
		byte[] buf = new byte[1024*1024*10];
		
		int count = 1;
		
		while((len = fis.read(buf))!= -1){
			
			fos = new FileOutputStream("H:\\2015学期电脑个人文件\\VID_copy"+count+".mp4");
			
			fos.write(buf,0,len);
			
			fos.close();
			count++;
			
		}
		fis.close();
		
		
	}

}
