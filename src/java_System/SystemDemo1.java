package java_System;

import java.util.Properties;

public class SystemDemo1 {

	public static void main(String[] args) {
		Properties pro =System.getProperties();
		
		for(Object obj : pro.keySet()){
			String vuale = (String)pro.get("os.name");
			System.out.println(obj+"...."+vuale);
		}

	}

}
