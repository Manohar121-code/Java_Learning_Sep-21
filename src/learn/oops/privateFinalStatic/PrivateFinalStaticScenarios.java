package learn.oops.privateFinalStatic;

public class PrivateFinalStaticScenarios {
	public static void main(String[] args) {
		
		Parent obj = new Child();
		obj.finalMethod();
		
		obj.staticMethod();
		Parent.staticMethod();
		
		Parent obj2 = null;
		obj2.staticMethod();
		
		Child obj3 = new Child();
		obj3.staticMethod();
		
	}
}
