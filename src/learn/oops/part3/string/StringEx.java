package learn.oops.part3.string;

public class StringEx {
	public static void main(String[] args) {
		String s = "java is a robust language";
		System.out.println(s);
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		System.out.println("-----------------------");
		
		String sObj = new String("java is a robust language");
		
		System.out.println("------------------");
		
		String s1 = "java";
		
		String s2 = "java";
		
		String s3 = new String("java");
		
		String s4 = new String("java");
		
		System.out.println(s1 == s2);
		
		System.out.println(s3 == s4);
		
		String intern = s3.intern();
		
		System.out.println(s1 == intern);
		
		System.out.println("-------------------------");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s3.equals(s4));
	}
}
