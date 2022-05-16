/*
Name: Nwby
Period: 2
Date: 2/22/22
Program: How long will it take to double your money?
*/
package sem2;

import java.util.Scanner;

public class DoubleMoneyRate {

	public static void main(String[] args) {
		
		Scanner kboard = new Scanner(System.in);
		
		System.out.println("What is your starting balance?");
		double balance = kboard.nextDouble();
		
		System.out.println("What is your interest rate? (Percent)");
		double rate = kboard.nextDouble();
		
		int time = 0;
		double doubledBalance = balance * 2;
		
		while (balance <= doubledBalance) {
			balance = balance * (1+(rate/100));
			time++;
		}
		
		System.out.println("After "+time+" years, your money will have at least doubled.");
		System.out.println("Your balance in "+time+" years: "+balance);
		kboard.close();
		

	}

}
