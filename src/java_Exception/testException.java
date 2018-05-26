package java_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.*;

public class testException {
	
	/*public void twonumchu(int n1 ,int n2)throws myexception{
		double num;
		if(n2 == 0){
			throw new myexception("除数不能为零", 1);
		}
		else if(n2 < 0){
			throw new myexception("除数不能小于0", 2);
		}
		else
			num =(double)( n1 / n2) ;
			System.out.println(""+n1 +"/"+n2+"=" +num);
		
	}*/
	
	public static void main(String[] args) throws myexception {
		// TODO Auto-generated method stub
		float num ;
		
		System.out.println("请输入第一位被除数:");
		
		Scanner	sc1 = new Scanner(System.in);
		try{
		
			int num1 = 5;
//					sc1.nextInt();
		
		System.out.println("请输入第二位除数:");
			int num2 = 2;
//					sc1.nextInt();
		
			
			if(num2 == 0){
				throw new myexception("除数为0", 1);
			}
			else if(num2 < 0){
				throw new myexception("除数小于0",2);
			}
			
			num = (float)(Math.round((num1 / num2)/1.0));
			
			System.out.println(""+ num1 + "/" + num2 + " = "+ num); 
		
		}
		catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println("请输入整数");
		}
		catch(myexception e){
			e.printStackTrace();
			e.getMessage();
			
			
		}
		
		
		
		
		
		
			
		
		
		
		  
		
		
		
		
	}

}
