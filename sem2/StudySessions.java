/*
Name: Nwby
Period: 2
Date: Feburary 2022
Program: Checking study sessions needed (test check)
*/
package sem2;

public class StudySessions {

	public static void main(String[] args) {
		
		int studySessions = 0;
		double knowledge = 0.3;
		
		while (knowledge < .95) {
			knowledge = knowledge + 0.2;
			studySessions++;
		}
		
		System.out.println("After "+studySessions+" study sessions, Arthur will have at least  95% knowledge");

	}

}
