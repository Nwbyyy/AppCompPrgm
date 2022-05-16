/*
Name: Nwby
Period: 2
Date: 11/4/21
Program: Testing String Methods
*/
package firstObjects;

public class StringIntroTester
{
	public static void main(String[] args)
	{
		String firstName = "Nixon";
		String lastName = "Showalter";
		
		StringIntro testerString = new StringIntro(firstName,lastName);
		
		
			System.out.println(testerString.Concats(firstName, lastName));
		
			System.out.println(testerString.PuttingQuotes(lastName));
		
			System.out.println(testerString.Backslash(lastName));
		
			System.out.println(testerString.Skipline(firstName, lastName));
			
		
	}

}
