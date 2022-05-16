/*
Name: Nwby
Period: 2
Date: Feburary 2022
Program: Making Euclids Algorithm to find GCF
*/
package sem2;

import java.util.Scanner;


public class EuclidsAlgorithm {
	public static void main(String[] args) {
		
		Scanner kboard = new Scanner(System.in);
		
		//Asks the users what two variables theyre finding the GCF of
		System.out.println("What is your first variable? ");
		int var1 = kboard.nextInt();
		
		System.out.println("What is your second variable? ");
		int var2 = kboard.nextInt();
		
		//Starts comparing the two, using a while loop to tell when they are equal
		while (var1 != var2) {
			
			if (var2 > var1) {
				var2 = var2 - var1;	
			}
			else {
				var1 = var1 - var2;
			}
		}
		
		//Printing their greatest common factor <3
		System.out.println("Your greatest common factor is: " + var1);
		kboard.close();
	}
}
