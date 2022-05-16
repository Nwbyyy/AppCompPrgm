/*
Name: Nwby
Period: 2
Date: 3/2/22
Program: Showing off Logical Errors
*/
package sem2;

public class LogicErrors {
	public static void incrementParam(int a) {
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		int x = 33;
		incrementParam(x);
		System.out.println(x);
	}
}
