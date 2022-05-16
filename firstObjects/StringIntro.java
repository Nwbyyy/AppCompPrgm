/*
Name: Nwby
Period: 2
Date: 11/2/21
Program: Making String Methods
*/
package firstObjects;

public class StringIntro {

	@SuppressWarnings("unused")
	private String input1;
	@SuppressWarnings("unused")
	private String input2;
	
	
	public StringIntro(String userInput1, String userInput2)
	{
		input1 = userInput1;
		input2 = userInput2;
	}
	
	
	public String Concats(String input1, String input2) 
	{
		return input1 + input2;
	}
	
	
	public String PuttingQuotes(String input1)
	{
		return "\"" + input1 + "\"";
	}
	
	
	public String Backslash(String input1)
	{
		return "\\" + input1 + "\\";
	}
	
	
	public String Skipline(String input1, String input2)
	{
		return input1 + "\n" + input2;
	}
}
