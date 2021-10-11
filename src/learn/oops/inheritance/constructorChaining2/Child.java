package learn.oops.inheritance.constructorChaining2;

public class Child extends Parent {
	private int cProp1;
	private String cProp2;

	public Child() {
		super(10, "java");
		System.out.println("Child Constructor called");
	}

	public int getcProp1() {
		return cProp1;
	}

	public void setcProp1(int cProp1) {
		this.cProp1 = cProp1;
	}

	public String getcProp2() {
		return cProp2;
	}

	public void setcProp2(String cProp2) {
		this.cProp2 = cProp2;
	}

}
