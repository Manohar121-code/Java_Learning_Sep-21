package learn.oops.blocks;

public class BlocksEx {

	static int i;

	static {
		i = 10;
		System.out.println("Static block1 executed");
	}

	static {
		System.out.println("Static block2 executed");
	}
	
	{
		System.out.println("Non-static1 block executed");
	}
	
	{
		System.out.println("Non-static2 block executed");
	}

	public static void main(String[] args) {
		System.out.println("Main executed");
		
		BlocksEx obj1 = new BlocksEx();
		System.out.println("Obj1 is created");
		
		BlocksEx obj2 = new BlocksEx();
		System.out.println("Obj2 is created");
	}
}
