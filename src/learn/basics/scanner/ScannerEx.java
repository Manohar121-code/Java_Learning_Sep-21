package learn.basics.scanner;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("enter a string");
		String s = scr.nextLine();
		System.out.println("Entered string - "+ s);
		
		System.out.println("enter a digit");
		int i = scr.nextInt();
		System.out.println("Entered digit - "+ i);
		
	}
}
