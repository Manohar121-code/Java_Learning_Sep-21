package learn.oops.polymorphism;

public class SignUp {

	public void register(int phoneNumber) {
		System.out.println("Registered by phone number - "+ phoneNumber);
	}
	
	public void register(String email) {
		System.out.println("Registered by email - "+ email);
	}
	
	public void register(int phoneNumber, String password) {
		System.out.println("Registered by phone number & password - "+ phoneNumber+", "+ password);
	}
	
	public void register(String email, String password) {
		System.out.println("Registered by email & password - "+ email +", "+ password);
	}
	
	public void register(int phoneNumber, String email, String password) {
		System.out.println("Registered by phone number & email & password - "+ phoneNumber + ", "+ email +", "+ password);
	}
}
