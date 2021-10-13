package learn.oops.accessModifiers;

public class Sample {

	private void privateMethod() {
		System.out.println("Private access method called");
	}
	
	void defaultMethod() {
		System.out.println("Default access method called");
	}
	
	protected void protectedMethod() {
		System.out.println("Protected access method called");
	}
	
	public void publicMethod() {
		System.out.println("Public access method called");
	}
}
