package java_Sockets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

public static void main(String[] args) throws IOException{
	/*
	 * ���տͻ��˵�����.
	 */
//	�����������˵�DatagramSocketָ���˿�.
	DatagramSocket socket = new DatagramSocket(8800);
	
//	�������ݰ������ڽ��տͻ��˷��͵�����.
	byte[] data = new byte[1024];//�����ֽ�����,ָ���������ݰ��Ĵ�С.
	
	DatagramPacket packet = new DatagramPacket(data,data.length);
	
	System.out.println("���������Ѿ��������ȴ��ͻ��˷�������.");
	
//	���տͻ��˷��͵�����.
	socket.receive(packet);//�˷����ڽ��յ����ݱ�֮ǰ��һֱ����.
	
//	��ȡ����.
	String info = new String(data,0,packet.getLength());
	
	System.out.println(" ���Ƿ��������ͻ���˵."+info);
	
	/*
	 * ��ͻ�����Ӧ����.
	 * 
	 */
	
//	����ͻ��˵ĵ�ַ���˿ںţ�����.
	InetAddress clientaddress = packet.getAddress();
	int port2 = packet.getPort();
	byte[] data2 = "������˵��ӭ��".getBytes();
//	�������ݱ�.������Ӧ��������Ϣ.
	DatagramPacket packet2 = new DatagramPacket(data2, data2.length, clientaddress, port2);
	socket.send(packet2);
//	�ر����Ӧ����Դ
	socket.close();


}

}