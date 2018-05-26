package java_SocketServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args) {
//		1.创建客户端Socket，指定端口号.
		try {
			Socket socket = new Socket("localhost",8888);
//			字节输出流.
			OutputStream os = socket.getOutputStream();
//			打印输出流.
			PrintWriter  pw = new PrintWriter(os);
//			打印
			pw.println("用户名:admin , 密码：123");
			
			pw.flush();
			
			socket.shutdownOutput();
			
			InputStream is = socket.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String read1 = null;
			
			while((read1 = br.readLine())!= null){
				
				System.out.println("我是客户端，服务端说了.:"+read1);
				
			}
			br.close();
			is.close();
			
			
			
			
			
			os.close();
			pw.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
