package endOfYear;

public class TransposeArray {
	
	public static int[][] Transpose(int[][] arr) {
		int[][] b;
		b = new int[(arr[0].length)][arr.length];
		
		for (int i = 0; i < arr[0].length; i++) {
			for (int k = 0; k < arr.length; k++) {
				b[i][k] = arr[k][i];
			}
		}
		
		return b;
	}
	
	
	
	
	public static void main(String[] args) {
	
		int[][] array;
		array = new int[2][3];
		int count = 1;
		
		for(int i = 0; i < array.length; i++) {
			for(int k = 0; k < array[0].length; k++) {
				array[i][k] = count;
				count += 1;
			}
		}
		
		System.out.println("Original Array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print("{");
			for(int k = 0; k < array[0].length - 1; k++) {
				System.out.print(array[i][k] + ", ");
			}
			System.out.print(array[i][array[0].length - 1]);
			System.out.println("}");
		}
		
		array = TransposeArray.Transpose(array);
		
		System.out.println("");
		System.out.println("Transposed Array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print("{");
			for(int k = 0; k < array[0].length - 1; k++) {
				System.out.print(array[i][k] + ", ");
			}
			System.out.print(array[i][array[0].length - 1]);
			System.out.println("}");
		}
	}
}
