package java_SocketServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
//			����һ��ServerSocket
			ServerSocket scoket_server = new ServerSocket(8888);
			System.out.println("***����˼�������,�ȴ��ͻ�������.");
			Socket socket = null;
			
			int count = 0;
			while(true){
				
				
//			����accept���������ͻ���.
			 socket = scoket_server.accept();
			
//			 ����һ���߳�.
			 ServerThread serverThread = new ServerThread(socket);
//			�����߳�.
			 serverThread.start();
			 
			 count++;//ͳ�ƿͻ��˵�����.
			System.out.println("�ͻ��˵�����:"+count);
			
			InetAddress address =socket.getInetAddress();
			
			System.out.println(address);
			 
			 
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
