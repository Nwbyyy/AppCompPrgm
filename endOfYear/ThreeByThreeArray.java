/*
Name: Nwby
Date: 4/26/22
Program: Making a 3x3 2D Array of odd numbers
*/
package endOfYear;

public class ThreeByThreeArray {

	public static void main(String[] args) {
	
		int[][] array;
		array = new int[3][3];
		int count = 1;
		
		for(int i = 0; i < 3; i++) {
			for(int k = 0; k < 3; k++) {
				array[i][k] = count;
				count += 2;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int k = 0; k < 3; k++) {
				System.out.println("The number at colum [" + i + "] row [" + k + "] is: " + array[i][k]);
			}
		}
		
		
		
	}

}