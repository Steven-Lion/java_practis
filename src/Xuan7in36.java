
public class Xuan7in36 {

	public static void main(String[] args) {
//		 �������鴢��7λ�����.
		int[] a = new int[7];
//		 ���������.
		 for(int i = 0;i<7 ;i++){
			
//			��֤��������ͬ����.
			while(true){
				
				a[i] = (int)(Math.random()*36)+1;
				
				for(int j = 0;j<i;j++){
					if(a[i] == a[j]){
					continue;
				}
					
				}
				break;
				
				
			}
		
		}
		for(int b : a){
		System.out.print(b+"   ");
		}
		
	}

}
