package learn.oops.blocks.typeCasting;

public class PrimitiveTypeCasting {
	public static void main(String[] args) {
		
		short s = 657;
		int i = s; //widening
		
		System.out.println(s);
		System.out.println(i);
		
		int i2 = 6878;
		short s2 = (short) i2; //narrowing
		
		System.out.println(i2);
		System.out.println(s2);
		
		char ch = '$';
		int i3 = ch; //widening
		
		System.out.println(ch);
		System.out.println(i3);
		
		char ch2 = (char) i3; //narrowing
		System.out.println(ch2);
	}
}
