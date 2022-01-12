package com.class2;

public class CalculationOfBasicMath {

	public static void main(String[] args) {
		/*
		 * 1. Write a java program to add, subtract, and divide 2 decimal. Value your
		 * program should say. "the ----- of 2 numbers--- and ---- is equal to ------.
		 */

		byte a = 10, b = 5, sum;
		sum = (byte) (a + b);

		System.out.println("The sum of 2 numbers " + a + " and " + b + " is equal to " + sum);
		
		//2. division so value should be "The division of two numbers ------ and ----- is queat to ---.

		int a1 = 12, b1 = 4, div;
		div = a1 / b1;
		System.err.println("The division of two numbers " + a1 + " and " + b1 + " is equal to " + div);
		
		/* 3. Write a program to find square the square of the number 3.9 
		 * and  your program should say "The square of the ----is ----"
		 */
		double a3=3.9, b3=3.9, square;
		square=a3*b3;
		System.err.println("The quare of the "+a3+" and " +b3+" is "+square);
		
		/* 4. write a program to print the area and perimeter of a rectangle with width =5 and hight =8 your program should say
		 * "The perimeter of rectagle with width--- and height---- is equal to----and the area is---"
		 * 
		 */
		float width=5f, height=8f, perimeter, area;
		area= width*height;
		perimeter=2*(width*height);
		System.out.println("The perimeter of rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area );
		
		int num1=15;
		int num2=4;
		System.out.println(num1/num2);
		int remainder= num1%num2;
		System.err.println(remainder);
		int myNumber=8+8*2;
		System.err.println(myNumber);
	}

}
