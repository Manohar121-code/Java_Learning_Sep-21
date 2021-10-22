package learn.oops.encapsulation;

public class SingletonEx {
	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getObject();
		Singleton obj2 = Singleton.getObject();
		Singleton obj3 = Singleton.getObject();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		System.out.println(obj1 == obj2);
	}
}
