package learn.basics.loops;

public class WhileLoopEx {
	public static void main(String[] args) {
		//syntax
//		dec/init
//		while(condition) {
//			
//			inc/dec
//		}
		
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("-------------");
		
		int j = 5;
		while (j >= 1) {
			System.out.println(j);
			j--;
		}
	}
}
