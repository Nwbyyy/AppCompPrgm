/*
Name: Nwby
Period: 2
Date: Feburary 2022
Program: Making a powers chart (use of print format <3)
*/
package sem2;

public class PowersProgram {

	public static void main(String[] args) {
		
		//Prints a cute table header that shows which multiples go where
		System.out.printf("%2s | %4s  | %4s  | %4s  %n", "x", "x^2", "x^3", "x^4");
		System.out.println("----------------------------");
		
		//Starts the for loop to give 10 powers of each number
		for (int x = 1; x <= 10; x++)
		{
			int twoPower = (int) Math.pow(x, 2);
			int threePower = (int) Math.pow(x, 3);
			int fourPower = (int) Math.pow(x, 4);
			
			//Prints out the given factors and formats them nicely with something I taught myself <3
			System.out.printf("%2s | %5s | %5s | %5s ", x, twoPower, threePower, fourPower);
			System.out.println("");
			
		}
			
	}

}
