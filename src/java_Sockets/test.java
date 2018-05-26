package java_Sockets;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

public class test {

	@Test
	public void client(){
		try {
			Socket s = new Socket("localhost",9090);
			OutputStream os =s.getOutputStream();
			os.write("你好，我是客户端".getBytes());
			s.shutdownOutput();
			os.close();
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void Server(){
		try {

			ServerSocket ss = new ServerSocket(9090);
			
			Socket s = ss.accept();
			
			InputStream is = s.getInputStream();
			
			byte[] b = new byte[1024];
			int len;
			while((len = is.read(b)) != -1){
				String str = new String(b,0,len);
				System.out.println(str);
			}
			
			is.close();
			s.close();
			ss.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
