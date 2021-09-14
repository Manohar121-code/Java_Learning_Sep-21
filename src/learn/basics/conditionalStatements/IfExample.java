package learn.basics.conditionalStatements;

public class IfExample {
	public static void main(String[] args) {
		//If Example
//		if(condition) {
//			
//		}
		
		int rank = 3000;
		if (rank <= 5000) {
			System.out.println("He might get seat in Vidyanikethan");
		}
		
		//If else Eample
//		if(condition) {
//			
//		} else {
//			
//		}
		
		int age = 15;
		if (age >= 18) {
			System.out.println("Person is eligible for vote");
		} else {
			System.out.println("Person is not eligible for vote");
		}
		
		if (age == 15) {
			System.out.println("age is 15");
		}
		
		if (age != 20) {
			System.out.println("age is not equals to 20");
		}
		
		
		//if elseif else
//		if(condition) {
//			
//		} else if(condition) {
//			
//		} else {
//			
//		}
		
		int n = 10;
		if (n > 10) {
			System.out.println("More than 10");
		} else if (n < 10) {
			System.out.println("Less than 10");
		} else {
			System.out.println("equals to 10");
		}
	}
}
