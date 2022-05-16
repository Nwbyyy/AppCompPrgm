/*
Name: Nwby
Period: 2
Date: 1/14/22
Program: Testing BooleanExpressions
*/
package sem2;

public class BooleanExpressions {

	public static void main(String[] args) {
		
		int myAge = 16;
		System.out.println("Current age: " + myAge);
		if (myAge >= 16)
		{
			System.out.println("You can learn to drive a car.");
			myAge++;			
		}
		System.out.println("On your next birthday, you will be "+ myAge+ ".");
	}
	
}
