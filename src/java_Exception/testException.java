package java_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.*;

public class testException {
	
	/*public void twonumchu(int n1 ,int n2)throws myexception{
		double num;
		if(n2 == 0){
			throw new myexception("��������Ϊ��", 1);
		}
		else if(n2 < 0){
			throw new myexception("��������С��0", 2);
		}
		else
			num =(double)( n1 / n2) ;
			System.out.println(""+n1 +"/"+n2+"=" +num);
		
	}*/
	
	public static void main(String[] args) throws myexception {
		// TODO Auto-generated method stub
		float num ;
		
		System.out.println("�������һλ������:");
		
		Scanner	sc1 = new Scanner(System.in);
		try{
		
			int num1 = 5;
//					sc1.nextInt();
		
		System.out.println("������ڶ�λ����:");
			int num2 = 2;
//					sc1.nextInt();
		
			
			if(num2 == 0){
				throw new myexception("����Ϊ0", 1);
			}
			else if(num2 < 0){
				throw new myexception("����С��0",2);
			}
			
			num = (float)(Math.round((num1 / num2)/1.0));
			
			System.out.println(""+ num1 + "/" + num2 + " = "+ num); 
		
		}
		catch(InputMismatchException e){
			e.printStackTrace();
			System.out.println("����������");
		}
		catch(myexception e){
			e.printStackTrace();
			e.getMessage();
			
			
		}
		
		
		
		
		
		
			
		
		
		
		  
		
		
		
		
	}

}
