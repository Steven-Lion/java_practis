package java_ArrayList;
import java.util.*;
public class ArrayList4 {
	
	public static void main(String[] args) {
		//���List<��>�����������ǻ���������������������ᱻ��Ϊ�����е�Ԫ�ء�
		
		int[] nums = {1,3,5};
		
		List<int[]> list = Arrays.asList(nums);
		sop(list);
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
	
}
