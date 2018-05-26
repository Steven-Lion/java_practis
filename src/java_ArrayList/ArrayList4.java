package java_ArrayList;
import java.util.*;
public class ArrayList4 {
	
	public static void main(String[] args) {
		//如果List<中>的数据类型是基本数据类型则他的数组会被作为集合中的元素。
		
		int[] nums = {1,3,5};
		
		List<int[]> list = Arrays.asList(nums);
		sop(list);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
	
}
