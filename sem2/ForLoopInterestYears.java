/*
Name: Nwby
Period: 2
Date: Feburary 2022
Program: Checking Intrest Over Time
*/
package sem2;

public class ForLoopInterestYears {
	public static void main(String[] args) {
		
		double balance = 200;
		double newBalance = 0;
		
		for (int count = 0; count < 100; count++) {
			
			//balance = balance * 1.03;
			newBalance = newBalance + (balance*.03);
		}
		
		//System.out.println("Balance: "+balance);
		System.out.println("Balance: "+newBalance);
		
	}
}