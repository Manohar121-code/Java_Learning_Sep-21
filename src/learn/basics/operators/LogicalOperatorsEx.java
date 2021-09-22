package learn.basics.operators;

public class LogicalOperatorsEx {
	public static void main(String[] args) {
		int k = 15;
		if (k > 10) {
			System.out.println("true");
		}
		
		if (k >= 20 || k < 18) {
			System.out.println("true");
		}
		
		if (k >= 20 && k < 18) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.println("-------------------");
		
		if (k >= 10 && (k == 10 || k <= 20)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.println("--------------");
		
		if (k >= 10 || (k == 10 && k <= 20)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
