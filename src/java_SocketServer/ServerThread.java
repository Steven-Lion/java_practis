package java_SocketServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * 服务器端线程处理类
 * 
 */
public class ServerThread extends Thread {
//			定义socket。
			Socket socket = null;
//		每当调用ThreadServer类都会初始化socket
			
			public ServerThread(Socket socket){
				this.socket = socket;
			}
			
//			执行线程执行的操作,响应客户端的请求.
			public void run(){

			//			  	创建一个字节输入流.
			InputStream is = null;
			//				将字节流包装成字符流.
			InputStreamReader isr = null;
			//				将字符流加入缓存流.
			BufferedReader buffReader = null;
			OutputStream os = null;
			PrintWriter pw = null;
			try {
					is = socket.getInputStream();
					isr = new InputStreamReader(is);
					buffReader = new BufferedReader(isr);
									
					String read1 = null;
					
					while((read1 = buffReader.readLine())!= null){
						
						System.out.println("服务端，客户端说:"+read1);
						
					}
					socket.shutdownInput();
					
					os = socket.getOutputStream();
					
					pw = new PrintWriter(os);
					
					pw.write("Server 对 Client　进行反应");
					
					pw.flush();
} catch (IOException e) {
	e.printStackTrace();
		}finally{
							
		try {
			//				关闭所有链接资源		
							if( pw != null)
								pw.close();
							if(os!= null)
								os.close();
							if(is!=null)
								is.close();
							if(isr!=null)
								isr.close();
							if(buffReader!=null)
								buffReader.close();
							if(socket!=null)
								socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}	
			}
}
