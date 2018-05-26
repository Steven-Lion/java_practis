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
//			创建一个URL实例
			URL url1 = new URL("http://www.baidu.com");
//			通过URL的OpenStream方法获取URL对象所表示的资源的字节.
			InputStream is = url1.openStream();
//			将字节输入流转化为字符输入流
			InputStreamReader isr = new InputStreamReader(is,"utf-8");
//			为字符输入流添加缓冲流.
			BufferedReader br = new BufferedReader(isr);
//			读取数据.
			String data = br.readLine();
//		           循环读取数据.
				while(data!= null){
//		 	输出数据
					System.out.println(data);
					data = br.readLine();
				}
//			关闭对应的数据流
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
