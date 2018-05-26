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
//			创建一个ServerSocket
			ServerSocket scoket_server = new ServerSocket(8888);
			System.out.println("***服务端即将启动,等待客户端链接.");
			Socket socket = null;
			
			int count = 0;
			while(true){
				
				
//			调用accept方法监听客户端.
			 socket = scoket_server.accept();
			
//			 创建一个线程.
			 ServerThread serverThread = new ServerThread(socket);
//			启动线程.
			 serverThread.start();
			 
			 count++;//统计客户端的数量.
			System.out.println("客户端的数量:"+count);
			
			InetAddress address =socket.getInetAddress();
			
			System.out.println(address);
			 
			 
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
