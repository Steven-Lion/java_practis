
public class Xuan7in36 {

	public static void main(String[] args) {
//		 创建数组储存7位随机数.
		int[] a = new int[7];
//		 创建随机数.
		 for(int i = 0;i<7 ;i++){
			
//			保证不会有相同的数.
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
