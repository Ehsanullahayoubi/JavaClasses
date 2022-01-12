package com.class2;

public class StringConcatenation {
	public static void main (String args[]) {
		String name="Anna";
		//Display in console: "Good morning Anna."
		System.out.println("Good morning "+name);
		
		
		int day=22;
		//Today is September 22.
		System.out.println("Today is September "+day);
		//or
		String text= "Today is September";
		System.out.println(text+day);
		
		int num1=12;
		int num2=13;
		//The value of num1=_ and the value of num2=_
		System.out.println("The value of num1="+num1+" and the value of num2="+num2);
	}

}
