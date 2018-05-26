package java_Map;
import java.util.*;

//KeySet（）返回一个映射关系的Set.

public class Maptest1 {

	public static void main(String[] args) {
		//创建Map集合.
		Map<String,String> map = new HashMap<String ,String>();
		
		map.put("01", "jaker");
		map.put("02", "Lucy") ;
		map.put("03", "corder");
		
		//Set有迭代器Iterator可以得到单例
		Set<String> Keyset = map.keySet();
		
		Iterator<String> it = Keyset.iterator();
		
		while(it.hasNext()){
			
			String key = it.next();
			String  value = map.get(key);
			System.out.println(key+" -- "+ value);
		}
	}

}
