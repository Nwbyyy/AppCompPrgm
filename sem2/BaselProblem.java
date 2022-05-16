/*
Name: Nwby
Period: 2
Date: 2/18/22
Program: Coding the Basel Problem (test prep)
*/
package sem2;

public class BaselProblem {

	public static void main(String[] args) {
		double total = 0;
		
		for (int k = 1; k < Math.pow(10, 6); k++) {
			total += (1 / Math.pow(k, 2));
		}
		
		System.out.println(total);
	}
}
