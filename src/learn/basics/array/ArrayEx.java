package learn.basics.array;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[] args) {
		//syntax
//		<data_type>[] <identifier> = new <data_type>[length];
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter array length");
		int length = scr.nextInt();
		int[] arr = new int[length];
		
		int len = arr.length;
		System.out.println("length of the array - "+len);
		
		arr[0] = 10; //initialization
		
		int n = arr[0]; //retrieving
		System.out.println("zero index value - "+ n);
		
		System.out.println("*********** set the values in array ***********");
		for(int i = 0; i < arr.length; i++) {
			System.out.println("enter a digit for index - "+ i);
			int k = scr.nextInt();
			arr[i] = k++;
		}
		
		System.out.println("*********** read the values from array ************");
		for(int i = 0; i < arr.length; i++) {
			int val = arr[i];
			System.out.println(val);
		}
	}
}
