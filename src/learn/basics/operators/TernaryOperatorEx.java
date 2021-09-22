package learn.basics.operators;

public class TernaryOperatorEx {
	public static void main(String[] args) {
		int i = 11;
		if (i == 10) {
			System.out.println(i);
		} else {
			System.out.println("false");
		}
		
		System.out.println((i == 10) ? i : "false");
		
		String s = (i == 10) ? "true" : "false";
		System.out.println(s);
	}
}
