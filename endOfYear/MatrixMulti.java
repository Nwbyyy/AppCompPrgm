/*
Name: Nwby
Date: 5/12/22
Program: Matrix Multiplication and Linear Algebra </3
*/
package endOfYear;

public class MatrixMulti {
	
	public static int[][] MMulti(int[][] arr, int[][] ref) {
		
		int[][] fin;
		fin = new int[(arr.length)][ref[0].length];
		
		int count = 0;
		int count2 = 0;
		int hold = 0;
	
		for(int m = 0; m < arr.length; m++) {
			
			for(int k = 0; k < ref[0].length; k++) {
			
				for(int n = 0; n < arr[0].length; n++) {
					
					hold += arr[m][n] * ref[n][k];
				}
			
				fin[count][count2] = hold;
				hold = 0;
				count2++;
			}
			
			count2 = 0;
			count++;
		}
		
		return fin;
	}
	
	
	
	public static void main(String[] args) {
		
		int[][] array;
		array = new int[3][3];
		int[][] ref;
		ref = new int[3][2];
		int[][] fin;
		int count = 1;
		
		for(int i = 0; i < array.length; i++) {
			for(int k = 0; k < array[0].length; k++) {
				array[i][k] = count;
				count += 1;
			}
		}
		
		count = 1;
		for(int i = 0; i < ref[0].length; i++) {
			for(int k = 0; k < ref.length; k++) {
				ref[k][i] = count;
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
		
		System.out.println("");
		System.out.println("Reference Array: ");
		for(int i = 0; i < ref.length; i++) {
			System.out.print("{");
			
			for(int k = 0; k < ref[0].length - 1; k++) {
				System.out.print(ref[i][k] + ", ");
			}
			System.out.print(ref[i][ref[0].length - 1]);
			System.out.println("}");
		}
		
		fin = MatrixMulti.MMulti(array, ref);
		
		System.out.println("");
		System.out.println("Multiplied Array:");
		for(int i = 0; i < fin.length; i++) {
			
			System.out.print("{");

			for(int k = 0; k < fin[0].length - 1; k++) {
				System.out.print(fin[i][k] + ", ");
			}
			
			System.out.print(fin[i][fin[0].length-1]);
			System.out.println("}");

		}
		
//		System.out.println("{" + fin[0][0] + ", " + fin[0][1] + "}");
//		System.out.println("{" + fin[1][0] + ", " + fin[1][1] + "}");	
//		System.out.println("{" + fin[2][0] + ", " + fin[2][1] + "}");
	}
}
