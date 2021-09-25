package learn.basics.patternProgramming;

//n = 5
//    * 	i = 1	spaces = 4	stars = 1
//   *** 	i = 2	spaces = 3	stars = 3
//  ***** 	i = 3	spaces = 2	stars = 5
// ******* 	i = 4	spaces = 1	stars = 7
//********* i = 5	spaces = 0	stars = 9
public class Pattern11 {
	public static void main(String[] args) {

		int n = 5;

		// rows
		for (int i = 1; i <= n; i++) {

			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}

			// stars
			for (int k = 1; k <= (2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
