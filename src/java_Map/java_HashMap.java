package java_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class java_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new HashMap();
		
//		1.��Map �����Ԫ�ص�.put(key,value); put(map);
		
		map.put("AA", new Person("AA",12));
		map.put("A", new Person("A",12));
		
//		2.��Map ��ȥ��Ԫ�ص�(����).
//		2.1�õ����ļ���.
		/*Set keyset = map.keySet();
		for(Object key:keyset){
			Object value = map.get(key);
			System.out.println(key + ":" + value);
		}*/
//		2.2�õ�value�ļ���.
		Collection values = map.values();
		for(Object val :values){
			System.out.println(val);
		}
//		3.�Ƴ�Ԫ��.
//		4�����߷���.
//		System.out.println(map.size());
//		System.out.println(map);
	}

}
