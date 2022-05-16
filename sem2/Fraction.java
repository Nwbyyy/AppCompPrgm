/*
Name: Nwby
Period: 2
Date: 3/8/22
Program: Class that makes fractions :D
*/
package sem2;

public class Fraction {
	
	private double num;
	private double denom;
	
	public Fraction() {
		num = 0;
		denom = 0;
	}
	
	public Fraction(double n, double d) {
		num = n;
		denom = d;
	}
	
	public double getNum() {
		return num;
	}
	
	public void setNum(double n) {
		num = n;
	}
	
	public double getDenom() {
		return denom;
	}
	
	public void setDenom(double d) {
		denom = d;
	}
	
	public double FracAdd(Object fraction1) {
		
		if (fraction1 instanceof Fraction) {
			
			Fraction fraction2 = (Fraction) fraction1;
			
			if(this.denom == fraction2.getDenom()) {
				
				double newNum = this.num + fraction2.getNum();
				double newDenom = this.denom;
				
				return newNum/newDenom;
			}
			
			else {
				
				double var1 = this.denom;
				double var2 = fraction2.getDenom();
				
				while (var1 != var2) {
					
					if (var2 > var1) {
						var2 = var2 - var1;	
					}
					else {
						var1 = var1 - var2;
					}
				}
				
				double newDenom = Math.abs((this.denom*fraction2.getDenom()))/var1;
				
				double newNum = (this.num * (newDenom/this.denom)) + (fraction2.getNum() * (newDenom/fraction2.getDenom()));
				
				
				return newNum/newDenom;
			}
		}
		else {
			return 0;
		}
	}
	
	public double FracSub(Object fraction1) {
		
		if (fraction1 instanceof Fraction) {
			
			Fraction fraction2 = (Fraction) fraction1;
			
			if(this.denom == fraction2.getDenom()) {
				
				double newNum = this.num - fraction2.getNum();
				double newDenom = this.denom;
				
				return newNum/newDenom;
			}
			
			else {
				
				double var1 = this.denom;
				double var2 = fraction2.getDenom();
				
				while (var1 != var2) {
					
					if (var2 > var1) {
						var2 = var2 - var1;	
					}
					else {
						var1 = var1 - var2;
					}
				}
				
				double newDenom = Math.abs((this.denom*fraction2.getDenom()))/var1;
				
				double newNum = (this.num * (newDenom/this.denom)) - (fraction2.getNum() * (newDenom/fraction2.getDenom()));
				
				
				return newNum/newDenom;
			}
		}
		else {
			return 0;
		}
	}
	
	public double FracMult(Object fraction1) {
		
		if (fraction1 instanceof Fraction) {
			
			Fraction fraction2 = (Fraction) fraction1;
			
			return (this.num * fraction2.getNum())/(this.denom * fraction2.getDenom());
		}
		
		else {
			return 0;
		}
	}
	
	public double FracDiv(Object fraction1) {
		
		if (fraction1 instanceof Fraction) {
			
			Fraction fraction2 = (Fraction) fraction1;
			
			return (this.num * fraction2.getDenom())/(this.denom * fraction2.getNum());
		}
		
		else {
			return 0;
		}
	}
	
	
}
