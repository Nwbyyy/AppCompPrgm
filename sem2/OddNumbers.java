/*
Name: Nwby
Period: 2
Date: 1/14/22
Program: Printing Odd Numbers 1-99
*/
package sem2;

public class OddNumbers {

	public static void main(String[] args) {
		 
		for (int num = 1; num <= 100; num++)
		{
			if (num%2 != 0)
			{
				System.out.print(num+", ");
			}
		}
		
	}
	
}
