/*
Name: Nwby
Period: 2
Date: 11/16/21
Program: Making Math Methods
*/
package myMath;

//Imports Math so you can avoid writing "Math." for everything
import static java.lang.Math.*;

public class MyMath
{	
//	//Gives the ability to make a math object with no variables becuase apparently you don't need them (Constructor)
	public MyMath() {}
	
	//Finds the answer to the quadratic formula, positive (Method)
	public double QuadraticPositive(double varA, double varB, double varC)
	{
		return (-varB + (sqrt(pow(varB,2.0) - (4 * varA * varC)))) / (2 * varA);
	}
	
	//Finds the answer to the quadratic formula, negative (Method)
	public double QuadraticNegative(double varA, double varB, double varC)
	{
		return (-varB - (sqrt(pow(varB,2.0) - (4 * varA * varC)))) / (2 * varA);
	}
	
	//Gives a random number between a given min and max (Method)
	public int RandNumGen(int maxNum)
	{
		return (int) (random() * (maxNum + 1));
	}
	
	//Gives the sin() of a given angle (Method)
	public double Sine(double x)
	{
		double factOne = ((pow(x,3))/(3*2*1));
		double factTwo = ((pow(x,5))/(5*4*3*2*1));
		double factThree = ((pow(x,7))/(7*6*5*4*3*2*1));
		double factFour = ((pow(x,9))/(9*8*7*6*5*4*3*2*1));
		double factFive = ((pow(x,11))/(11*10*9*8*7*6*5*4*3*2*1));
		
		return (x - factOne + factTwo - factThree + factFour - factFive);
	}
	
	//Gives the cos() of a given angle (Method)
	public double Cose(double x)
	{
		double factOne = ((pow(x,2))/(2*1));
		double factTwo = ((pow(x,4))/(4*3*2*1));
		double factThree = ((pow(x,6))/(6*5*4*3*2*1));
		double factFour = ((pow(x,8))/(8*7*6*5*4*3*2*1));
		double factFive = ((pow(x,10))/(10*9*8*7*6*5*4*3*2*1));
		
		return (1 - factOne + factTwo - factThree + factFour - factFive);
	}
	
	//Find the hypotenuse using the Pythagorean theorem (Method)
	public double Pythag(double a, double b)
	{
		return sqrt(pow(a,2) + pow(b,2));
	}
	
	//Finds the solution for the sin double angle formula (Method)
	public double SineDouble(double x)
	{
		double factOneCos = ((pow(x,2))/(2*1));
		double factTwoCos = ((pow(x,4))/(4*3*2*1));
		double factThreeCos = ((pow(x,6))/(6*5*4*3*2*1));
		double factFourCos = ((pow(x,8))/(8*7*6*5*4*3*2*1));
		double factFiveCos = ((pow(x,10))/(10*9*8*7*6*5*4*3*2*1));
		
		double cosTheta = (1 - factOneCos + factTwoCos - factThreeCos + factFourCos - factFiveCos);
		
		double factOneSin = ((pow(x,3))/(3*2*1));
		double factTwoSin = ((pow(x,5))/(5*4*3*2*1));
		double factThreeSin = ((pow(x,7))/(7*6*5*4*3*2*1));
		double factFourSin = ((pow(x,9))/(9*8*7*6*5*4*3*2*1));
		double factFiveSin = ((pow(x,11))/(11*10*9*8*7*6*5*4*3*2*1));
		
		double sinTheta = (x - factOneSin + factTwoSin - factThreeSin + factFourSin - factFiveSin);	
		
		return 2 * cosTheta * sinTheta;
	}
	
	//Finds the solution for the cos double angle formula (Method)
	public double CoseDouble(double x)
	{
		double factOneCos = ((pow(x,2))/(2*1));
		double factTwoCos = ((pow(x,4))/(4*3*2*1));
		double factThreeCos = ((pow(x,6))/(6*5*4*3*2*1));
		double factFourCos = ((pow(x,8))/(8*7*6*5*4*3*2*1));
		double factFiveCos = ((pow(x,10))/(10*9*8*7*6*5*4*3*2*1));
		
		double cosTheta = (1 - factOneCos + factTwoCos - factThreeCos + factFourCos - factFiveCos);
		
		double factOneSin = ((pow(x,3))/(3*2*1));
		double factTwoSin = ((pow(x,5))/(5*4*3*2*1));
		double factThreeSin = ((pow(x,7))/(7*6*5*4*3*2*1));
		double factFourSin = ((pow(x,9))/(9*8*7*6*5*4*3*2*1));
		double factFiveSin = ((pow(x,11))/(11*10*9*8*7*6*5*4*3*2*1));
		
		double sinTheta = (x - factOneSin + factTwoSin - factThreeSin + factFourSin - factFiveSin);	
		
		return pow(cosTheta,2) - pow(sinTheta,2);
	}	
}
