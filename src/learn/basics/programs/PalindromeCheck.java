package learn.basics.programs;

import java.util.Scanner;

public class PalindromeCheck {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = scr.next();
		String rev = reverse(s);
		
		boolean equals = s.equals(rev);
		
		System.out.println("Palindrome? " + equals);
	}

	private static String reverse(String s) {
		int start = 0;
		int end = s.length() - 1;

		String rev = "";
		for (int i = end; i >= start; i--) {
			char ch = s.charAt(i);
			rev = rev + ch;
		}
		return rev;
	}
}
