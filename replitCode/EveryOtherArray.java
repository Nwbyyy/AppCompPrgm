/*
Name: Nwby
Date: 3/22/22
Project: Every other odd number to 10,000 array
*/
package replitCode;

public class EveryOtherArray {
	public static void main(String[] args) {
		int[] listOne = new int[2500];
		int count = 0;
		   
		for(int i = 1; i < 10000; i+=4) {
			listOne[count] = i;
			count++;
		 }
	
	System.out.print(listOne[3]);
	}
}
