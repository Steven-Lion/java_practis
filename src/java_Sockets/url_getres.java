package java_Sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class url_getres {

	public static void main(String[] args) {
		try {
//			����һ��URLʵ��
			URL url1 = new URL("http://www.baidu.com");
//			ͨ��URL��OpenStream������ȡURL��������ʾ����Դ���ֽ�.
			InputStream is = url1.openStream();
//			���ֽ�������ת��Ϊ�ַ�������
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
//			Ϊ�ַ���������ӻ�����.
			BufferedReader br = new BufferedReader(isr);
//			��ȡ����.
			String data = br.readLine();
//		           ѭ����ȡ����.
				while(data!= null){
//		 	�������
					System.out.println(data);
					data = br.readLine();
				}
//			�رն�Ӧ��������
			br.close();
			isr.close();
			is.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
