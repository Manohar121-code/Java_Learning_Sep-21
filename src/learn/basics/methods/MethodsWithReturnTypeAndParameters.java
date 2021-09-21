package learn.basics.methods;

import java.util.Scanner;

public class MethodsWithReturnTypeAndParameters {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("enter first digit");
		int n1 = scr.nextInt();
		
		System.out.println("enter second digit");
		int n2 = scr.nextInt();
		
		int sum = sum(n1, n2);
		System.out.println(sum);
	}
	
	public static int sum(int i, int j) {
		int sum = i + j;
		return sum;
	}
}
