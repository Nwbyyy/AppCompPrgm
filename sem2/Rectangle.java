/*
Name: Nwby
Period: 2
Date: 3/2/22
Program: Class that makes rectangles :D
*/
package sem2;

public class Rectangle {
	
	private int width;
	private int height;
	
	//Makes a default rectangle that is 1x1
	public Rectangle() {
		width = 1;
		height = 1;
	}
	
	//Makes a rectangle with two inputs
	public Rectangle(int h, int w) {
		height = h;
		width = w;
		
		if (height < 0) {
			height = height * -1;
		}
		
		if (width < 0) {
			width = width * -1;
		}
	}
	
	//Makes a rectagle with one input
	public Rectangle(int h) {
		height = h;
		width = h;
		
		if (height < 0) {
			height = height * -1;
		}
		
		if (width < 0) {
			width = width * -1;
		}
	}
	
	//Does some magic with printf to draw the rectangle
	public void drawRectangle() {
		int spaces = width * 2 - 3;
		
		System.out.printf("%s","*");
		
		for (int i = 0; i < width-1; i++) {
			System.out.printf("%2s","*");
		}

		for (int k = 0; k < height-2; k++) {
			System.out.println("");
			System.out.printf("%-" + spaces + "s %s", "*", "*");
		}
		
		System.out.print("\n");
		System.out.printf("%s","*");
		
		for (int i = 0; i < width-1; i++) {
			System.out.printf("%2s","*");
		}
	}
	
	//Returns the area of the shape
	public int getArea() {
		return height * width;
	}
	
	//Returns the perimeter of the shape
	public int getPerimeter() {
		return (height * 2) + (width *2);
	}
	
	//Sets the height of the shape
	public void setHeight(int h) {
		height = h;
	}
	
	//Sets the width of the shape
	public void setWidth(int w) {
		width = w;
	}
		
}