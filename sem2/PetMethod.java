/*
Name: Nwby
Period: 2
Date: 2/28/22
Program: Making methods for Pets
*/
package sem2;

public class PetMethod {
	
	private String name;
	private String typeOfPet;
	private int age;
	
	public PetMethod() {
		name = "";
		typeOfPet = "";
		age = 0;
	}
	
	public PetMethod(String n, String type, int a) {
		name = n;
		typeOfPet = type;
		age = a;
	}
	
	public String GetName() {
		return name;
	}
	
	public String GetType() {
		return typeOfPet;
	}
	
	public int GetAge() {
		return age;
	}
	
	public void SetName(String n) {
		name = n;
	}
	
	public void SetType(String type) {
		typeOfPet = type;
	}
	
	public void SetAge(int a) {
		age = a;
	}
}
