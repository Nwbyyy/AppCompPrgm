/*
Name: Nwby
Period: 2
Date: 3/2/22
Program: Class that tests rectangles :D
*/
package sem2;

import java.util.Scanner;

public class RectangleTester {

	public static void main(String[] args) {
		Scanner intBoard = new Scanner(System.in);
		Scanner stringBoard = new Scanner(System.in);
		
		//Initializes the shape early so I can use it anywhere (or something)
		Rectangle shape = new Rectangle();
		
		//Initializes the units early so they can be used everywhere
		String units = "";
		
		//While loop checking variable
		boolean tester = true;
		
		//First while loop, gives the option between square or rectangle
		while(tester == true) {
			
			//Asks user what they want their first action to be
			System.out.println("What do you want to make?");
			System.out.println("Options: \"Sqaure\" or \"Rectangle\"");
			String option = stringBoard.nextLine();
			
			//Asks the user what units they want to use
			System.out.println("");
			System.out.println("What unit are your measurements in?");
			System.out.println("Ex: \"inches\", \"feet\", etc.");
			units = stringBoard.nextLine();
			
			//Actions if the user choses square
			if(option.equalsIgnoreCase("square")) {
				
				//Gets the side length of the square
				System.out.println("");
				System.out.println("What is a side length of your square?");
				int length = intBoard.nextInt();
				
				//Sets the width and height of the preinitialized shape
				shape.setHeight(length);
				shape.setWidth(length);
				
				//Prints out their square
				System.out.println("Here it is!");
				System.out.println("");
				shape.drawRectangle();
				
				//Sets the loop check variable
				tester = false;
			}
			
			//Actions if the user choses rectangle
			else if(option.equalsIgnoreCase("rectangle")) {
				
				//Gets the width of the rectangle
				System.out.println("");
				System.out.println("What is the width of your rectangle?");
				int width = intBoard.nextInt();
				
				//Gets the height of the rectangle
				System.out.println("");
				System.out.println("What is the height of your rectangle?");
				int height = intBoard.nextInt();
				
				//Sets the width and height of the preinitialized shape
				shape.setHeight(height);
				shape.setWidth(width);
				
				//Prints out their rectangle
				System.out.println("Here it is!");
				System.out.println("");
				shape.drawRectangle();
				
				//Sets the loop check variable
				tester = false; 
			}
			
			else {
				//Goes back into the while loop if they use an invalid input
				System.out.println("This is an invalid shape option, please try again.");
			}
		}
		
		//Puts two spaces between the first question and the second
		for(int i = 0; i < 2; i++) {
			System.out.println("");
		}
		
		//Second while loop, gives the option to check the area, perimeter, or end the code
		while(true) {
			
			//Now asks the user what they want to do with their shape
			System.out.println("\nWhat would you like to do now?");
			System.out.println("Options: \"Area\", \"Perimeter\", or \"End\" if you are all done. ");
			String option2 = stringBoard.nextLine();
			
			//Gives the user the area if they so chose
			if (option2.equalsIgnoreCase("area")) {
				System.out.println("");
				System.out.println("The area of your shape is: " + 	shape.getArea() + " " + units + "²!");
			}
			
			//Gives the user the perimeter if they so chose
			else if (option2.equalsIgnoreCase("perimeter")) {
				System.out.println("");
				System.out.println("The perimeter of your shape is: " + shape.getPerimeter() + units + "!");
			}
			
			//Ends the program if the user is done
			else if (option2.equalsIgnoreCase("end")) {
				System.out.println("");
				System.out.println("Thank you!");
				stringBoard.close();
				intBoard.close();
				System.exit(0);
			}
			
			//Continues the loop if the user uses an invalid input
			else {
				//Goes back into the while loop if they use an invalid input
				System.out.println("This is an invalid option, please try again.");
			}
		}
	}
}