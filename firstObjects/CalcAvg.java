/*
Name: Nwby
Period: 2
Date: 10/28/21
Program: Making a non-void method
*/
package firstObjects;

public class CalcAvg 
{

	private int numOne;
	private int numTwo;
	
	
	public CalcAvg(int inputOne, int inputTwo)
	{
		numOne = inputOne;
		numTwo = inputTwo;
	}
	
	
	
	public int findAvg()
	{
		return (numOne + numTwo)/2;
	}
	
	
}
