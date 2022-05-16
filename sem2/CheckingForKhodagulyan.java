/*
Name: Nwby
Period: 2
Date: 1/18/22
Program: Checking the spelling of Khodagulyan
*/
package sem2;

import java.util.Scanner;

public class CheckingForKhodagulyan {

	public static void main(String[] args) {
		
		Scanner kboard = new Scanner(System.in);
			
		System.out.println("How do you spell our teachers name?");
		String userInput = kboard.nextLine();
		
		if (userInput.equalsIgnoreCase("Khodagulyan")) {
			System.out.println("Good job! That's the correct spelling!");
			
			kboard.close();
		}
		
		else {
			System.out.println("Sorry, that's not correct. Please try again!");
			
		}

	}

}
