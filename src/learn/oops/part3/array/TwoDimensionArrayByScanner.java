package learn.oops.part3.array;

import java.util.Scanner;

public class TwoDimensionArrayByScanner {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int rows = scr.nextInt();
		
		System.out.println("Enter number of cols");
		int cols = scr.nextInt();
		
		int[][] arr = new int[rows][cols];
		
		System.out.println("**************** Set the values in array *****************");
		
		for (int i = 0; i < rows; i++) {
			
			for (int j = 0; j < cols; j++) {
				System.out.println("enter some value in "+i+" row & "+ j+ " column");
				arr[i][j] = scr.nextInt();
			}
			
		}
		
		System.out.println("**************** Read the values from array *****************");
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int val = arr[i][j];
				System.out.print(val+" ");
			}
			System.out.println();
		}
		
		//3D array
		int[][][] arr2 = new int[3][3][3];
	}
}
