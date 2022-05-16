package endOfYear;

public class EigenValues {

	public static double[][] ChangeEigen(double[][] arr, double lamda) { 
		
		for(int i = 0; i < arr.length; i++) {
			for(int k = 0; k < arr[0].length; k++) {
				if(i == k) {
					arr[i][k] -= lamda;
				}
			}
		}
		
		return arr;
	}
	
	
	
	
	public static void main(String[] args) {
		
		double[][] array;
		array = new double[5][5];
		int count = 1;
		
		for(int i = 0; i < array.length; i++) {
			for(int k = 0; k < array[0].length; k++) {
				array[i][k] = count;
				count += 2;
			}
		}
		
		
		
		System.out.println("Original Array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print("{");
			for(int k = 0; k < array[0].length - 1; k++) {
				System.out.print(array[i][k] + ", ");
			}
			System.out.print(array[i][array[0].length - 1]);
			System.out.println("}");
		}
		
		EigenValues.ChangeEigen(array, 10.0);
		
		System.out.println("");
		System.out.println("Eigen Value Array: ");
		for(int i = 0; i < array.length; i++) {
			System.out.print("{");
			for(int k = 0; k < array[0].length - 1; k++) {
				System.out.print(array[i][k] + ", ");
			}
			System.out.print(array[i][array[0].length - 1]);
			System.out.println("}");
		}
	}

}
