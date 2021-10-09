package learn.oops.inheritance;

public class Parent {
	private int id;
	private String name;

	public void test() {
		System.out.println("Parent test() called");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
