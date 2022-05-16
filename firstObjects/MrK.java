/*
Name: Nwby
Period: 2
Date: 10/6/21
Program: Mr. K Object
*/
package firstObjects;

public class MrK
{
	
	private int age;
	private String mood;
	private boolean enrichment;
	
	
	// Creates an object with age at 20, angry mood, and no enrichment
	public MrK() 
	{
		age = 20;
		mood = "angry";
		enrichment = false;
	}
	
	// Creates an object with a given age, mood, and if there's enrichment
	public MrK(int hisAge, String hisMood, boolean hasEnrichment) 
	{
		age = hisAge;
		mood = hisMood;
		enrichment = hasEnrichment;
	}
	
	
	
		public void getAge() 
		{
			System.out.println("");
			System.out.println("Your Mr. K is "+ age+" years old.");
		}

		public void setAge(int newAge)
		{
			age = newAge;
		}
	
		public void getMood()
		{
			System.out.println("");
			System.out.println("Your Mr. K is "+ mood+" today.");
		}
		
		public void setMood(String newMood)
		{
			mood = newMood;
		}
		
		public void getEnrichment()
		{
			System.out.println("");
			System.out.println("It is "+ enrichment+" that your Mr. K has enrichment today.");			
		}
		
		public void setEnrichment(boolean newEnrichment)
		{
			enrichment = newEnrichment;
		}
		
}