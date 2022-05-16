/*
Name: Nwby
Date: 4/26/22
Program: Making a 3x3 2D Array of powers of 7
*/
package endOfYear;

import java.lang.Math;

public class ThreeByThree7P {

	public static void main(String[] args) {
		
		int[][] array;
		array = new int[3][3];
		int count = 1;
		
		for(int i = 0; i < 3; i++) {
			for(int k = 0; k < 3; k++) {
				array[i][k] = (int) Math.pow(7, count);
				count++;
			}
		}
		
		for(int i = 0; i < 3; i++) {
			for(int k = 0; k < 3; k++) {
				System.out.println("The number at colum [" + i + "] row [" + k + "] is: " + array[i][k]);
			}
		}
		
		
	}
}
