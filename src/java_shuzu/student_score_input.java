package java_shuzu;

import java.util.Scanner;


public class student_score_input {
	
	
	
	public static void main(String[] args) {
		
		int max = 0;
		
		System.out.println("������ѧ������:");
		
		Scanner scr = new Scanner(System.in);
		
		
		int num = scr.nextInt();

		int [] student_num = new int [num];
		
		int [] stu_score = new int [num];
		
		for (int i = 0; i < student_num.length; i++) {
			
			System.out.println("�������"+ (i+1)+"����:");
		
			int score = scr.nextInt();

		    stu_score [i] = score;
			
			if(stu_score[i]>max){
				max  = stu_score[i];
			}
			if(i == student_num.length-1){
				System.out.println("��߷�����:"+ max );
				for(int j =0;j<student_num.length;j++){
					System.out.println("student:"+(j+1)+ " score = " + stu_score[j]);
				}
			
			}
		}
		
		
		
			
		
		
	}

}
