package learn.basics.loops;

public class BreakEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				break;
			}
		}
		
		System.out.println("----------");
		
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			if (k == 7) {
				break;
			}
			k++;
		}
		
		System.out.println("Main ended");
	}
}
