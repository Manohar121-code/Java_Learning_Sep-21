package learn.basics.loops;

public class ContinueEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("Main ended");
	}
}
