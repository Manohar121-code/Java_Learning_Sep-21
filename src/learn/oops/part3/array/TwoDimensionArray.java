package learn.oops.part3.array;

public class TwoDimensionArray {
	public static void main(String[] args) {
		
		int[] arrOld = new int[5]; //1D array
		arrOld[0] = 10;
		
		for(int i = 0; i < arrOld.length; i++) {
			arrOld[i] = 10;
		}
		
		//---------------------------------------------------------
		
		int rows = 3;
		int cols = 3;
		int[][] arr = new int[rows][cols]; //2D array

		int val = 10;
		//rows
		for(int i = 0; i < rows; i++) {
			
			//cols
			for (int j = 0; j < cols; j++) {
				
				arr[i][j] = val++;
				
			}
			
		}
		
		//--------------------
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int k = arr[i][j];
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
}
