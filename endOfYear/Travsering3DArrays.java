/*
Name: Nwby
Date: 4/26/22
Program: Traversing a 2D array
*/
package endOfYear;

public class Travsering3DArrays {

	public static void main(String[] args) {

		String[][] arr = {{"My", "A"}, {"AP", "Class"}, {"CS", "Rocks!"}};
		
		for(int i = 0; i < arr[0].length; i++) {
			
			for(int k = 0; k < arr.length; k++) {
				
				System.out.print(arr[k][i] + " ");
			}
		}
		
	}

}

/*
{
{"My", "A"}, 
{"AP", "Class"}, 
{"CS", "Rocks!"}
}
*/