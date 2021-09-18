package learn.basics.loops;

public class DoWhileLoopEx {
	public static void main(String[] args) {
		//syntax
//		do {
//			
//		} while(condition);
		
		int i = 10;
		do {
			System.out.println(i);
			i--;
		} while (i <= 1);
		
		System.out.println("------------");
		
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 5);
	}
}
