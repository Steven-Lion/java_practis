package java_Sockets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

public static void main(String[] args) throws IOException{
	/*
	 * 接收客户端的数据.
	 */
//	创建服务器端的DatagramSocket指定端口.
	DatagramSocket socket = new DatagramSocket(8800);
	
//	创建数据包，用于接收客户端发送的数据.
	byte[] data = new byte[1024];//创建字节数组,指定接收数据包的大小.
	
	DatagramPacket packet = new DatagramPacket(data,data.length);
	
	System.out.println("服务器端已经启动，等待客户端发送数据.");
	
//	接收客户端发送的数据.
	socket.receive(packet);//此方法在接收到数据报之前会一直阻塞.
	
//	读取数据.
	String info = new String(data,0,packet.getLength());
	
	System.out.println(" 我是服务器，客户端说."+info);
	
	/*
	 * 向客户端响应数据.
	 * 
	 */
	
//	定义客户端的地址，端口号，数据.
	InetAddress clientaddress = packet.getAddress();
	int port2 = packet.getPort();
	byte[] data2 = "服务器说欢迎你".getBytes();
//	创建数据报.包含响应的数据信息.
	DatagramPacket packet2 = new DatagramPacket(data2, data2.length, clientaddress, port2);
	socket.send(packet2);
//	关闭相对应的资源
	socket.close();


}

}