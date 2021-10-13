package learn.basics.string;

import learn.oops.accessModifiers.Sample;

public class StringEx {
	public static void main(String[] args) {
		String s = "Program is very easy";
		int len = s.length();
		System.out.println("Length - "+ len);
		
		int index = 3;
		char ch = s.charAt(index);
		System.out.println("char at 3rd index - "+ ch);
		
		char chr = 'o';
		int i2 = s.indexOf(chr);
		System.out.println("index of o - "+ i2);
		
		char r = 'r';
		int i3 = s.indexOf(r);
		System.out.println("index of r - "+ i3);
		
		int i4 = s.indexOf(r, 2);
		System.out.println("index of r after 1st index - "+ i4);
		
		int i5 = s.lastIndexOf(r);
		System.out.println("last index of r - "+ i5);
		
		String concat = s.concat(" to understand");
		System.out.println(concat);
		
		boolean equals = s.equals("Program is very easy");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("program Is Very eaSy");
		System.out.println(equalsIgnoreCase);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		String replace = s.replace('m', 'b');
		System.out.println("after replacing - "+ replace);
		
		System.out.println(s);
		
		System.out.println("-------------------");
		
		String[] split = s.split(" ");
		for(int i = 0; i < split.length; i++) {
			String str = split[i];
			System.out.println(str);
		}
		
		System.out.println("-------------------");
		
		boolean startsWith = s.startsWith("Program");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("easy");
		System.out.println(endsWith);
		
		String substring1 = s.substring(4);
		System.out.println("substring from 4th index onwards - "+ substring1);
		
		String substring2 = s.substring(4, 13);
		System.out.println("substring from 4th index till 13th index - "+ substring2);
		
		System.out.println("---------------------");
		
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		System.out.println("---------------------");
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);
		
		int i = 100;
		String valueOf = String.valueOf(i);
		System.out.println(valueOf);
		
		
	}
	
}
