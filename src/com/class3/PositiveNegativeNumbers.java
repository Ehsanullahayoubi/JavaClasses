package com.class3;

public class PositiveNegativeNumbers {

	public static void main(String[] args) {
		int n=-1;
		if(0<n) {
			System.out.println(n+" Positive Number");
		}else if(n==0) {
			System.out.println("values of n is "+n);
		}else {
			System.out.println(n+" Negative Number");
		}
		
		System.out.println("------------------");
		int a=6;
		if (a%2==0) {
			System.out.println("Even number");
		}else if(a%2!=0) {
			System.out.println("Odd Number");
		}else {
			System.out.println("Values should not be zero Enter Odd or Even number");
		}
		
		System.out.println("-------------------");
		int x=5;
		if (x%2==0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd nubmer");
		}

	}

}
