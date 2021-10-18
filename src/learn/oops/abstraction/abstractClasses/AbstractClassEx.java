package learn.oops.abstraction.abstractClasses;

public class AbstractClassEx {
	public static void main(String[] args) {

//		Sample obj = new Sample();
		
		SampleChild obj = new SampleChild();
		obj.test();
		obj.m1();
		
		Sample obj2 = new SampleChild2(); //upcasting
		obj2.test();
		obj2.m1();
	}
}
