package java_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * entrySet����һ��ӳ���ϵ����ΪMap�ӿ��е�Entry�ӿڡ�
 * ֻ�д�����map������ӳ���ϵ.
 * Map.Entry;
 */
public class Maptest2 {

	public static void main(String[] args) {
		//����Map����.
				Map<String,String> map = new HashMap<String ,String>();
				
				map.put("01", "jaker");
				map.put("02", "Lucy") ;
				map.put("03", "corder");
		//Set
			Set<Map.Entry<String, String>> entryset = map.entrySet();
			
			
		//����������.
				
				Iterator<Map.Entry<String,String>> it = entryset.iterator();
				
				while(it.hasNext()){
					Map.Entry<String, String> me = it.next();
					String key = me.getKey();
					String value = me.getValue();
					System.out.println(key +"0--0"+ value);
				}
	}

}
