package com.class3;

public class InClass2Task {

	public static void main(String[] args) {
		double a=4;
		double b=6;
		if(a>b) {
			System.out.println("Double value a is greater than b");
		}else {
			System.out.println("Double values is smaller b");
		}
		double d=32;
		double d1=100;
		if (a>d) {
			System.out.println("Water will freeze with the temprature a");
		}else {
			System.out.println("Water will not freeze with temperature d1");
		}
		boolean val=true;
		if(val) { // if val==true?
			System.out.println("Hello");
		}else {
			System.out.println("bye");
		}
		boolean isRain=false;
		//if it is raining i will take umbrella, otherwise I go for a walk.
		if(isRain) {  //isRain==true but it is not true
			System.out.println("I will take umbrella");
		}else {
			System.out.println("I go for a walk");
		}

	}

}
