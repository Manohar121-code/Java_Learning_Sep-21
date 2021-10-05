package learn.basics.programs;

public class MaxNumInArray {
	public static void main(String[] args) {
		int[] arr = {14, 17, 20, 8, 5};
		int max = maxNumber(arr);
		System.out.println("Max number - "+ max);
	}

	private static int maxNumber(int[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			int n = arr[i];
			if (n > max) {
				max = n;
			}
		}
		return max;
	}
}
