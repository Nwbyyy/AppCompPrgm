package ch2;

/*
Name: Nwby
Period: 2
Date: 9/16/21
Program: Favorite Food Input
*/

import java.util.Scanner;

public class WhatIsYouFavz {
	public static void main(String[] args) {
		
		Scanner kboard = new Scanner(System.in);
		
		System.out.print("What is your favorite food?");
		String favFood = kboard.nextLine();
		
		System.out.println(favFood +" is really good!");
		System.out.println("I should get myself some!");
		 
		kboard.close();
	}
}
