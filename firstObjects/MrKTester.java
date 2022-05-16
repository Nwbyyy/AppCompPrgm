/*
Name: Nwby
Period: 2
Date: 10/12/21
Program: User created Mr. K Object
*/
package firstObjects;

import java.util.Scanner;

public class MrKTester
{
	public static void main(String args[])
	{
		//Sets up scanners for strings, integers, and boolean (it wouldn't work if I only used one 0-0)
		Scanner stringKboard = new Scanner(System.in);
		Scanner numsKboard = new Scanner(System.in);
		Scanner tfKboard = new Scanner(System.in);
		
		//Fun little welcome statement
		System.out.println("Welcome to Nixon's 'Mr. K' Generator!");
		System.out.println("");
		
		
		//Asks the user three questions about the Mr. K they are making
		System.out.println("What is your Mr. K's age?");
		int inputAge = numsKboard.nextInt();
		
		System.out.println("What is your Mr. K's current mood?");
		String inputMood = stringKboard.nextLine().toLowerCase();
		
		System.out.println("Does your Mr. K have enrichment today? (true or false)");
		boolean inputEnrichment = tfKboard.nextBoolean();
		
		//Puts a space between questions and the printed info
			for(int count=0; count<5; count++)
			{
				System.out.println("");
			}
		
		//Creates a default MrK and then uses methods from other class to set the values to the user input
		MrK userTeacher = new MrK();
			//sets values
			userTeacher.setAge(inputAge);	
			userTeacher.setMood(inputMood);
			userTeacher.setEnrichment(inputEnrichment);	
			//displays values
			userTeacher.getAge();
			userTeacher.getMood();
			userTeacher.getEnrichment();
			System.out.println("");
			System.out.println("");
			
		//Asks the user if they want to make updates to their Mr. K
		System.out.println("Do you want to update your Mr. K? (true or false)");
		boolean updateTeacher = tfKboard.nextBoolean();
		//If they do, runs (slightly changed) questions about the three variable
		if (updateTeacher == true)
			{
			System.out.println("");
			System.out.println("");
			
			//Asks the user three questions about giving their Mr. K new values
			System.out.println("What is your Mr. K's new age?");
			int newInputAge = numsKboard.nextInt();
			
			System.out.println("What is your Mr. K's new current mood?");
			String newInputMood = stringKboard.nextLine().toLowerCase();
			
			System.out.println("Does your Mr. K still have enrichment today? (true or false)");
			boolean newInputEnrichment = tfKboard.nextBoolean();
			
			//Puts a space between questions and the printed info
			for(int count=0; count<5; count++)
				{
				System.out.println("");
				}
				
				//sets new values
				userTeacher.setAge(newInputAge);	
				userTeacher.setMood(newInputMood);
				userTeacher.setEnrichment(newInputEnrichment);
				//displays new values
				userTeacher.getAge();
				userTeacher.getMood();
				userTeacher.getEnrichment();
				System.out.println("");
			}
		//If they do not, ends the code
		else if(updateTeacher == false)
			{
			System.exit(0);
			}
		
		//Closes scanners which is a good thing
		stringKboard.close();
		numsKboard.close();
		tfKboard.close();
		
	}
}