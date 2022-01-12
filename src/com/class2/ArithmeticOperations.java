package com.class2;

public class ArithmeticOperations {
	public static void main(String args[]) {
		/*
		 * declare two variables and initialize them 
		 * perform on them addition, subtraction, multiplication, and division.
		 */
		int num1, num2;
		num1=10;
		num2=5;
		//we can print number doing process of math
		System.out.println(num1+num2); // 10+5=15
		System.out.println(num1-num2); //10-5=5
		System.out.println(num1*num2); // 10 * 5= 50
		System.out.println(num1/num2); // 10/5=2
		
		System.err.println(num1+ " "+num2);
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mult=num1*num2;
		int div=num1/num2;
		
		//System.out.println(sum, sub, mult, div); does not work for such a way in java
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
	}

}
