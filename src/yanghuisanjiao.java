
public class yanghuisanjiao {
		public static void main(String[] args) {
			
			String str = "*" ;
			
			for (int i = 10 ; i > 0; i--) {
			if(i%2 == 0){
				for(int j = 0 ; j < i;j++)
				{	
					System.out.print(str);
					
				}
				}
				if(i%2 != 0)
					System.out.println();
				
				
				for (int j2 = 0; j2 <= 10-i; j2++) {
					if(j2%2 == 0)
					System.out.print(" ");
				}
			
		}
			
		
}
		
}

