package ch2;

/*
Name: Nwby
Period: 2
Date: 9/20/21
Program: Mathmatical Operations
*/

import java.util.Scanner;

public class MathematicalOperators {
	public static void main(String[] args) {
		
		Scanner kboard = new Scanner(System.in);
		
		System.out.println("What is the answer to 58+7*(3-1)+17%3?");
		int userAnswer = kboard.nextInt();
		
		
		if (userAnswer == 74) {
			System.out.println("Good job! You got it right!");
		}else if (userAnswer != 74){
			System.out.println("Yikes that's not correct, maybe next time!");
		}
		
		kboard.close();
		
	}
}
