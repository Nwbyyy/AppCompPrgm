/*
Name: Nwby
Period: 2
Date: 11/16/21 (Made fancy on 12/2/21)
Program: Testing Math Methods
*/
package myMath;

//Imports needed (and helpful) packages
import java.util.Scanner;
import static java.lang.Math.*;


public class MyMathTester 
{
	public static void main(String[] args)
	{
		//Creates the math object for the whole class
		MyMath mathObject = new MyMath();
		
		//Loops entire code in case user inputs wrong data
		while (true)
		{
			Scanner stringBoard = new Scanner(System.in);
		
			//Asks the user what math function they want to use
			System.out.println("What math operation do you want to do? ");
			System.out.println("Please type: \"Quadratic\", \"Random\", \"Sin\", \"Cos\", \"Hypotenuse\",");
			System.out.println("\"Double Sin\", or \"Double Cos\"");

			String mathOption = stringBoard.nextLine();
			
			//Sets up if statement depending on user input
			if (mathOption.equalsIgnoreCase("quadratic"))
			{
				//Loops code so if there is an error, the user can restart
				while (true)
				{
					Scanner kboard = new Scanner(System.in);
					
					
					//Asks the user to input their three numbers
					System.out.println("What is your \"a\" variable?");
					int varA = kboard.nextInt();
					
					System.out.println("What is your \"b\" variable?");
					int varB = kboard.nextInt();
					
					System.out.println("What is your \"c\" variable?");
					int varC = kboard.nextInt();
					
					//Stores b^2 and 4ac to variables to compare them
					double varBSquared = pow(varB,2.0);
					double varAvarC = 4 * varA * varC;
									
					//Tests if b^2 is less than 4ac
					//If b^2 is greater than 4ac, prints out the users positive and negative solutions and exits the code to stop the loop
					if (varBSquared > varAvarC)
					{
						System.out.print("Your solutions are ");
						System.out.println(mathObject.QuadraticPositive(varA, varB, varC) + ", " + mathObject.QuadraticNegative(varA, varB, varC));
						kboard.close();
						stringBoard.close();
						System.exit(0);
					}
					
					//If b^2 is less than 4ac then it tells the user that their inputs are bad and restarts the code
					else
					{
						System.out.println("Incorrect inputs, b^2 must be greater than 4ac.");
						System.out.println("Your b^2: "+varBSquared+"      "+"Your 4ac: "+varAvarC+"\n\n\n");
					}
				}
			}
			
			//Continues if statement for second user input
			else if (mathOption.equalsIgnoreCase("random"))
			{
				Scanner kboard = new Scanner(System.in);
				
				//Asks for maximum value
				System.out.println("What is your maximum value?");
				int maxNum = kboard.nextInt();
				
				//Gives user their random number with the method
				System.out.println("Your random number is " + mathObject.RandNumGen(maxNum));
				
				kboard.close();
				stringBoard.close();
				System.exit(0);
			}
			
			//Continues if statement for third user input
			else if (mathOption.equalsIgnoreCase("sin"))
			{
				Scanner kboard = new Scanner(System.in);
				
				//Asks for an angle
				System.out.println("What is your angle?");
				double angle = kboard.nextDouble();
				
				//Gives user their sin value with the method
				System.out.println("Your sin value is: " + mathObject.Sine(angle));
				
				kboard.close();
				stringBoard.close();
				System.exit(0);
			}
			
			//Continues if statement for fourth user input
			else if (mathOption.equalsIgnoreCase("cos"))
			{
				Scanner kboard = new Scanner(System.in);
				
				//Asks for an angle
				System.out.println("What is your angle?");
				double angle = kboard.nextDouble();
				
				//Gives user their cos value with the method
				System.out.println("Your cos value is: " + mathObject.Cose(angle));
				
				kboard.close();
				stringBoard.close();
				System.exit(0);	
			}
			
			//Continues if statement for fifth user input
			else if(mathOption.equalsIgnoreCase("hypotenuse"))
			{
				Scanner kboard = new Scanner(System.in);
				Scanner unitBoard = new Scanner(System.in);
				
				//Asks for a first side length
				System.out.println("What is your first side length?");
				double sideA = kboard.nextDouble();
				
				//Asks for a second side length
				System.out.println("What is your second side length?");
				double sideB = kboard.nextDouble();
				
				//Asks for a unit
				System.out.println("What units are you using (ex. meters)?");
				String units = unitBoard.nextLine();
				
				//Gives user their cos value with the method
				System.out.println("Your hypotenuse length is: " + mathObject.Pythag(sideA, sideB) + " " + units);
				
				kboard.close();
				unitBoard.close();
				stringBoard.close();
				System.exit(0);
			}
			
			//Continues if statement for sixth user input
			else if (mathOption.equalsIgnoreCase("double cos"))
			{
				Scanner kboard = new Scanner(System.in);
				
				//Asks for an angle
				System.out.println("What is your angle?");
				double angle = kboard.nextDouble();
				
				//Gives user their double angle cos value with the method
				System.out.println("Your double angle cos value is: " + mathObject.CoseDouble(angle));
				
				kboard.close();
				stringBoard.close();
				System.exit(0);	
			}
			
			//Continues if statement for seventh user input
			else if (mathOption.equalsIgnoreCase("double sin"))
			{
				Scanner kboard = new Scanner(System.in);
				
				//Asks for an angle
				System.out.println("What is your angle?");
				double angle = kboard.nextDouble();
				
				//Gives user their double angle sin value with the method
				System.out.println("Your double angle sin value is: " + mathObject.SineDouble(angle));
				
				kboard.close();
				stringBoard.close();
				System.exit(0);	
			}
			
			//Tells the user their input is invalid if they don't follow instructions
			else
			{
				System.out.print("Invalid option.\n");
			}
		 }		
	}
}
