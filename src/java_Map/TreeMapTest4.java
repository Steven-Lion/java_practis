package java_Map;
import java.util.*;
public class TreeMapTest4 {

	public static void main(String[] args) {
		
		String str = new String("abcababccackk");
		
		System.out.println(count(str));

	}
	public static String count(String 	str){
		
		//转为char字符数组.
		char[] ch = str.toCharArray();
		
		//TreeSet.
		TreeMap<Character,Integer> ts = new TreeMap<Character,Integer>();
		
		
		
		
		for (int i = 0; i < ch.length; i++) {
			Integer value = ts.get(ch[i]);
			 if(value == null){
				 
				 ts.put(ch[i], 1);
				 
			 }
			 else{
				 value += 1;
				 ts.put(ch[i],value);
			 }
		}
		System.out.println(ts);
		
		//Set.
		Set<Map.Entry<Character,Integer>> set1 = ts.entrySet();
				
		//Iterator.
		Iterator<Map.Entry<Character, Integer>> it = set1.iterator();
		
		//StringBuilder;
		StringBuilder sb = new StringBuilder();
		
		while(it.hasNext()){
			
			Map.Entry<Character,Integer> me = it.next();
			
			Character key = me.getKey();
			Integer value = me.getValue();
			
			sb.append(key+"("+value+")");
			
			
		}
		
		
		//System.out.println(ts);
		
		return sb.toString();
	}

}
