package learn.basics.incDec;

public class IncDecEx {
	public static void main(String[] args) {
		
		int i = 10;
		System.out.println(i); // 10
		i++; //post inc
		System.out.println(i); // 11
		++i; //pre inc
		System.out.println(i); // 12
		
		System.out.println("-----------");
		
		int k = 5;
		System.out.println(k++);
		System.out.println(k);
		
		System.out.println("------------");
		
		int g = 15;
		System.out.println(++g); // 16
		
		if (++g >= 17) {
			System.out.println("true");
		}
		
		System.out.println("-----------------");
		
		int r = 7;
		r--;
		System.out.println(r); //6
		--r;
		System.out.println(r); //5
		
		System.out.println("-----------");
		
		System.out.println(r--);
		System.out.println(r); // 4
		
		System.out.println("---------");
		
		System.out.println(--r); // 3
		
		System.out.println("-------------------");
		
		int s = 10;
		s = s + 2;
		System.out.println(s); //12
		
		s += 2;
		System.out.println(s); //14
		
		s -= 2;
		System.out.println(s); //12
		
		s *= 3;
		System.out.println(s); //36
		
		s /= 4;
		System.out.println(s); //9
		
		s %= 4;
		System.out.println(s); //1
		
	}
}
