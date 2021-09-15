package learn.basics.conditionalStatements;

public class SwitchEx {
	public static void main(String[] args) {
		//switch syntax
//		switch (key) {
//		case value1:
//			
//			break;
//		case value2:
//			
//			break;
//		default:
//			break;
//		}
		
		int i = 20;
		switch (i) {
		case 10:
			System.out.println("case10 executed");
			break;
		case 20:
			System.out.println("case20 executed");
			break;
		case 30:
			System.out.println("case30 executed");
			break;
		case 40:
			System.out.println("case40 executed");
			break;
		default:
			System.out.println("default case executed");
			break;
		}
	}
}
