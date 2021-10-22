package learn.oops.encapsulation;

public class Singleton {
	
	private Singleton() {
		
	}
	
	private static Singleton obj;
	
	public static Singleton getObject() {
		if (obj == null) {
			obj = new Singleton();
		}
		return obj;
	}
	
}
