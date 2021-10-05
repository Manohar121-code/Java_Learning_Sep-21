package learn.basics.programs;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a digit");
		int n = scr.nextInt();
		boolean evenOrOdd = evenOrOdd(n);
		System.out.println(n + " is even? " + evenOrOdd);
	}
	
	public static boolean evenOrOdd(int n) {
//		if ((n % 2) == 0) {
//			return true;
//		}
//		return false;
		
		boolean even = false;
		if ((n % 2) == 0) {
			even = true;
		}
		return even;
	}
}
