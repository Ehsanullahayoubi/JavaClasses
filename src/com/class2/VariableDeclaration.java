package com.class2;

public class VariableDeclaration {
	public static void main(String args[]) {
	//1. Declaring variables num1, num2, num3, num4 and assigning values to it;
	int num1=123;
	int num2=67676;
	Long num3=57127701031l;
	
	//2. Declaring varialbes first and them assigning values;
	int n1;
	int n2;
	int n3;

	n1=5;
	n2=6;
	n3=8;
	
	//3. Declaring all variables together and then assigning values;
	 int number1, number2, number3;
	 
	 number1=12;
	 number2=15;
	 number3=20;
	 System.out.println(number1);
	 //Declaration happens once in declaring.
	 number3=1000;
	 System.err.println(number3);
	 Boolean var=true;
	 System.out.println(var);
	 //declare assgin then print otherwise print will not work if values is not assigned.
	 char myVariable;
	 myVariable='*';
	 System.out.println(myVariable);
	 
	 number2=number1; //12
	 System.out.println(number2);
	 //number2=false; --> compile time error asking to change datatype of variable number2 to boolean.
	 boolean isRain=false;
	 boolean isSnow=true;
	 isSnow=isRain; //isSnow=false
	 System.out.println(isSnow);
	 isSnow=true;
	 System.out.println(isSnow);
			
	
	
}
}
