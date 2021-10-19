package learn.oops.abstraction.interfaces;

public class InterfaceEx {
	public static void main(String[] args) {
		SampleImpl s = new SampleImpl();
		s.m1();
		s.m2();
		
		ISample obj = new SampleImpl(); //up casting
		obj.m1();
		obj.m2();
	}
}
