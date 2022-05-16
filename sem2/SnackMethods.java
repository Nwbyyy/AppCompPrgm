/*
Name: Nwby
Period: 2
Date: 2/24/22
Program: Making methods for Snacks
*/
package sem2;

public class SnackMethods {

	private String name;
	private int calories;
	
	public SnackMethods() {
		name = "";
		calories = 0;
	}
	
	public SnackMethods(String n, int c) {
		name = n;
		calories = c;
	}
	
	public void SetName(String n) {
		name = n;
	}
	
	public void SetCalories(int c) {
		calories = c;
	}
	
	public String GetName() {
		return name;
	}
	
	public int GetCalories() {
		return calories;
	}
	
	@SuppressWarnings("unused")
	private boolean CanEat() {
		if (calories < 150) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
