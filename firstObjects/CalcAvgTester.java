/*
Name: Nwby
Period: 2
Date: 10/28/21
Program: Making a non-void method
*/
package firstObjects;

import java.util.Scanner;

public class CalcAvgTester {

	public static void main(String[] args) {
		
		Scanner kboard = new Scanner(System.in);
		
		System.out.println("What is your first number?");
		int numOne = kboard.nextInt();
		
		System.out.println("what is your second number?");
		int numTwo = kboard.nextInt();
		
		CalcAvg averageCalc = new CalcAvg(numOne, numTwo);
		
		System.out.print("Your average is ");
		System.out.print(averageCalc.findAvg());
		
	}

}
