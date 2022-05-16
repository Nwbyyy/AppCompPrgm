package ch2;

/*
Name: Nwby
Period: 2
Date: 9/24/21
Program: Head Shoulders Knees and Toes
*/

public class HeadShouldersKneesAndToes {
	public static void main(String[] args) {
		
	  //for(initialization; Boolean expression; update) { }
		for(int count=0; count<3; count++) {
			
			for(int outputLine=1; outputLine<6; outputLine++) {
				
				if (outputLine == 1 || outputLine == 2) {
					System.out.println("Head, shoulders, knees, and toes, knees, and toes,");
					}
				
					else if (outputLine == 3) {
						System.out.println("And eyes, and ears, and mouth, and nose,");
					}
					else if (outputLine == 4) {
						System.out.println("Head, shoulders, knees, and toes, knees, and toes.");
					}
					else if (outputLine == 5) {
						System.out.println(" ");
					}
			}
			
		}
		
	}
	
}	
