package java_SocketServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/*
 * ���������̴߳�����
 * 
 */
public class ServerThread extends Thread {
//			����socket��
			Socket socket = null;
//		ÿ������ThreadServer�඼���ʼ��socket
			
			public ServerThread(Socket socket){
				this.socket = socket;
			}
			
//			ִ���߳�ִ�еĲ���,��Ӧ�ͻ��˵�����.
			public void run(){

			//			  	����һ���ֽ�������.
			InputStream is = null;
			//				���ֽ�����װ���ַ���.
			InputStreamReader isr = null;
			//				���ַ������뻺����.
			BufferedReader buffReader = null;
			OutputStream os = null;
			PrintWriter pw = null;
			try {
					is = socket.getInputStream();
					isr = new InputStreamReader(is);
					buffReader = new BufferedReader(isr);
									
					String read1 = null;
					
					while((read1 = buffReader.readLine())!= null){
						
						System.out.println("����ˣ��ͻ���˵:"+read1);
						
					}
					socket.shutdownInput();
					
					os = socket.getOutputStream();
					
					pw = new PrintWriter(os);
					
					pw.write("Server �� Client�����з�Ӧ");
					
					pw.flush();
} catch (IOException e) {
	e.printStackTrace();
		}finally{
							
		try {
			//				�ر�����������Դ		
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
