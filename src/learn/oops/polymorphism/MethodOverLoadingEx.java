package learn.oops.polymorphism;

public class MethodOverLoadingEx {
	public static void main(String[] args) {
		SignUp obj = new SignUp();
		obj.register(6546);
		
		obj.register("tejesh@gmail.com");
		
		obj.register(765756645, "5646");
		
		obj.register("Mahesh@gmail.com", "8768hgg7");
		
		obj.register(41565477, "Mohan@gmail.com", "8v76t87");
	}
}
