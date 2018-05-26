package java_Sockets;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UDPClient {

		public static void main(String[] args) throws IOException {
			/*
			 * ��������˷�������
			 * 
			 */
//			����������ĵ�ַ���˿ںţ�����.
			InetAddress serveraddress = InetAddress.getByName("localhost");
			int port = 8800;
			byte[] data = "�û�����admin ;���룺123".getBytes();
//			�������ݱ����������͵�������Ϣ.
			DatagramPacket packet = new DatagramPacket(data, data.length, serveraddress, port);
//			����DatagramSocket����.
			DatagramSocket socket = new DatagramSocket();
//			��������˷������ݱ�.
			socket.send(packet);
			
			/*
			 * ���շ���������Ӧ������.
			 */
//			1.�������ݱ������ڽ��շ���������Ӧ������.
			byte[] data2 = new byte[1024];
			DatagramPacket packet2 = new DatagramPacket(data2,data2.length);
//			2.���շ�������Ӧ������.
			socket.receive(packet2);
//			��ȡ����.
			String reply = new String(data2, 0,packet2.getLength());
			System.out.println("���ǿͻ��ˣ�������˵:"+reply);
			socket.close();
		
		}
}
