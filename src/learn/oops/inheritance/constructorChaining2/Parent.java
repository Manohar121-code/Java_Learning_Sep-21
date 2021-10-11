package learn.oops.inheritance.constructorChaining2;

public class Parent {

	private int pProp1;
	private String pProp2;

//	public Parent() {
//		System.out.println("Parent Constructor Called");
//	}
	
	public Parent(int pProp1, String pProp2) {
		super();
		this.pProp1 = pProp1;
		this.pProp2 = pProp2;
		System.out.println("Parent Constructor called");
	}

	public int getpProp1() {
		return pProp1;
	}

	public void setpProp1(int pProp1) {
		this.pProp1 = pProp1;
	}

	public String getpProp2() {
		return pProp2;
	}

	public void setpProp2(String pProp2) {
		this.pProp2 = pProp2;
	}

}
