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
//		1.�����ͻ���Socket��ָ���˿ں�.
		try {
			Socket socket = new Socket("localhost",8888);
//			�ֽ������.
			OutputStream os = socket.getOutputStream();
//			��ӡ�����.
			PrintWriter  pw = new PrintWriter(os);
//			��ӡ
			pw.println("�û���:admin , ���룺123");
			
			pw.flush();
			
			socket.shutdownOutput();
			
			InputStream is = socket.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String read1 = null;
			
			while((read1 = br.readLine())!= null){
				
				System.out.println("���ǿͻ��ˣ������˵��.:"+read1);
				
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
