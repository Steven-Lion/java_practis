package java_Map;
import java.util.*;

//KeySet��������һ��ӳ���ϵ��Set.

public class Maptest1 {

	public static void main(String[] args) {
		//����Map����.
		Map<String,String> map = new HashMap<String ,String>();
		
		map.put("01", "jaker");
		map.put("02", "Lucy") ;
		map.put("03", "corder");
		
		//Set�е�����Iterator���Եõ�����
		Set<String> Keyset = map.keySet();
		
		Iterator<String> it = Keyset.iterator();
		
		while(it.hasNext()){
			
			String key = it.next();
			String  value = map.get(key);
			System.out.println(key+" -- "+ value);
		}
	}

}
