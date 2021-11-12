package learn.oops.part3.exceptionHandling;

import learn.oops.inheritance.constructorChaining.Child;
import learn.oops.inheritance.constructorChaining.Parent;
import learn.oops.part3.collectons.map.nonPrimitive.Employee;

public class TryCatchEx {
	public static void main(String[] args) {
		System.out.println("Main started");
		try {
			int[] arr = new int[5];
			arr[7] = 10;
			
			int i = 10/0;
			System.out.println("i value - "+ i);
			
			Employee obj = null;
			String name = obj.getName();
			System.out.println("Name - "+ name);
			
			Parent obj2 = new Parent();
			Child child = (Child) obj2;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException occurred - "+ e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException occurred - "+ e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurred - "+ e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("RuntimeException occurred - "+ e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception occurred - "+ e.getMessage());
		} finally {
			System.out.println("Finally block will execute for sure");
		}
		
		System.out.println("Main ended");
	}
}
