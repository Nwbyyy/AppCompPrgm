/*
Name: Nwby
Period: 2
Date: 11/1/21
Program: String Objects and Methods
*/
package firstObjects;

public class StringObjects {

	public static void main(String[] args) {
		
		String name1 = "Nixon Showalter";
		String name2 = new String("Autumn Stewart"); 
		int myAge = 17;
		int friendAge = 18;
		String Nixon = name1 + " " + myAge;
		name2 += friendAge;
		
		System.out.println(Nixon);
		System.out.println(name2);
		
		System.out.println("\""+name1+"\"");
		System.out.println("\\"+name2+"\\");
		
	}

}
