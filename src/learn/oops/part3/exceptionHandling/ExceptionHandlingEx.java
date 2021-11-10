package learn.oops.part3.exceptionHandling;

import learn.oops.part3.collectons.map.nonPrimitive.Employee;

public class ExceptionHandlingEx {
	public static void main(String[] args) {
		System.out.println("Main Started");
		int divide = divide(10, 2);
		System.out.println(divide);
		
		int divide2 = divide(10, 0);
		System.out.println(divide2);
		
		int[] arr = new int[5];
		arr[4] = 10;
		
		System.out.println("----------------------");
		
//		String s = "java";
//		char charAt = s.charAt(6);
//		System.out.println(charAt);
		
		Employee obj = null;
		if (obj != null) {
			System.out.println(obj.getName());
		}
		System.out.println("Main Ended");
	}
	
	public static int divide(int i, int j) {
		if (j == 0) {
			System.out.println("dividing value should not be a zero");
			return -1;
		}
		int div = i / j;
		return div;
	}
}
