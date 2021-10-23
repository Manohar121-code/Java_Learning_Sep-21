package learn.oops.wrapperClasses;

public class WrapperClassesEx {
	public static void main(String[] args) {
		
		int i = 10;//primitive data type
		Integer iObj = new Integer(i); //boxing
		
		int i2 = iObj.intValue();//unboxing
		
		System.out.println(i);
		System.out.println(iObj);
		System.out.println(i2);
		
		System.out.println("-----------------");
		
		double d = 1365.72;
		Double dObj = d; //boxing
		
		double d2 = dObj.doubleValue();//unboxing
		
		System.out.println(d);
		System.out.println(dObj);
		System.out.println(d2);
		
		System.out.println("-----------------");
		
		boolean b = true;
		Boolean bObj = new Boolean(b);//boxing
		boolean b2 = bObj.booleanValue();//unboxing
		
		System.out.println(b);
		System.out.println(bObj);
		System.out.println(b2);
		
		System.out.println("-----------------");
		
		char ch = '@';
		Character cObj = new Character(ch);//boxing
		char c2 = cObj.charValue();//unboxing
		
		System.out.println(ch);
		System.out.println(cObj);
		System.out.println(c2);
	}
}
