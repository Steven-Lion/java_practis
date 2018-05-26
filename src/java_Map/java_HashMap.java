package java_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class java_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new HashMap();
		
//		1.向Map 中添加元素的.put(key,value); put(map);
		
		map.put("AA", new Person("AA",12));
		map.put("A", new Person("A",12));
		
//		2.向Map 中去除元素的(遍历).
//		2.1得到键的集合.
		/*Set keyset = map.keySet();
		for(Object key:keyset){
			Object value = map.get(key);
			System.out.println(key + ":" + value);
		}*/
//		2.2得到value的集合.
		Collection values = map.values();
		for(Object val :values){
			System.out.println(val);
		}
//		3.移除元素.
//		4。工具方法.
//		System.out.println(map.size());
//		System.out.println(map);
	}

}
