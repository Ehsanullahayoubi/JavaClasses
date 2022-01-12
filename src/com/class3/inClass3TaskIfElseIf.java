package com.class3;

public class inClass3TaskIfElseIf {
public static void main(String args[]) {
	int num1=100;
	int num2=100;
	if(num1>num2) {
		System.out.println("Num1 is greater than num2");
	}else if(num1==num2) {
		System.out.println("Num1 is equal to num2");
	}else {
		System.out.println("Num1 is smaller than Num2");
	}
	
	int day=6;
	if (day==1) {
		System.out.println("Today is Monday. I have to go to work");
	}else if(day==2) {
		System.out.println("TOday is Tuesday.I have SDLC class");
	} else if(day==3) {
		System.out.println("Today is Wednesdy. I have SDLC Review class");
	}else if(day==4) {
		System.out.println("Today is Thuesday. I have SDLC Review class");
	}else if(day==5) {
		System.out.println("Today is Friday. Weekend");
	}else if(day==6) {
		System.out.println("Today is Saturday. My favorite coding day");
	}else if (day==7) {
		System.out.println("Today is Sunday. I love to spend at Syntax");
	}else{
		System.out.println("I do not know this day");
	}
	System.out.println("I am done with the If Statement");
}
}
