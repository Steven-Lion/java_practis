package java_list;

import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = new int[3][4];
		//al(a);
		int a2[][][] = new int[][][] {

			{{1,2,3},{4,5,6}},
			{{7,8,9},{10,11,12}},
			{{13,14,15},{16,17,18}}

		};

		//a2(a2);
		int a3[][] = new int[][] {
			{1,2,3},{4,5,6},{7,8,9}
		};
		//a3(a3);
		int a4[] = new int[] {
				13,24,54,22,31,90,9
		};
		Arrays.sort(a4);
		for(int x =a4.length-1; x >= 0 ;x--) {
			System.out.println(a4[x]);
		}

	}

	public static void a3(int [][] a) {

		int[][] arr2 = new int[a.length][a.length];
	
		for(int i = 0;i<a.length;i++) {

				for(int k = 0;k<a[i].length;k++) {

					arr2[k][i] = a[i][k];

				}
		}
					al(arr2);

	}
	
	public static void a2(int [][][] a) {
		for(int i = 0 ;i<a.length;i++) {
			
			for(int k = 0 ;k<a[0].length;k++) {

				for(int j = 0 ;j<a[0][0].length;j++) {
					
				System.out.print(a[i][k][j]+" ");
				}
				System.out.println();
			}
				System.out.println();
		}
		System.out.println("a.length:"+a.length+"\na[0].length:"+a[0].length+"\na[0][0].length:"+a[0][0].length);

	}

	public static void al(int [][] a) {
		for(int i = 0 ;i<a.length;i++) {
			
			for(int k = 0 ;k<a[i].length;k++) {
				System.out.print(a[i][k]+" ");

			}
				System.out.println();
		}
		
	}
}
