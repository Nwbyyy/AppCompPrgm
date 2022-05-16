/*
Name: Nwby
Period: 2
Date: Feburary 2022
Program: Testing Nested If Loops
*/
package sem2;

public class NestedIf {

	public static void main(String[] args) {
		
		int age = 16;
		boolean isLate = false;
		
		if (age > 10)
			if (isLate)
				System.out.println("Line #1");
			else
				System.out.println("Line #2");
		else
			System.out.println("Line #3");
		System.out.println("Line #4");

	}

}
