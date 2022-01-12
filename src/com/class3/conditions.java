package com.class3;

import javax.swing.tree.AbstractLayoutCache;

public class conditions {

	public static void main(String[] args) {
		int expectedHours=15;
		int actualHours=20;
		// if expected hours are more than actual -> you will succeed. Otherwise, please study more.
		if(actualHours>expectedHours) {
			System.out.println("You will succeed");
		}else {
			System.out.println("Please study more");
		}
			
			double teaPrice=4.99;
			double allowedPrice=3.99;
			teaPrice-=2; // 2.99 =4.99-2=2.99
			// If price is more that i can afford i will not buy/ if price is less or matches what i can afford then i will buy tea.
			
			if (allowedPrice<=teaPrice) {
				System.out.println("I will by tea");
				System.out.println("and I will enjoy my tea");
			}else {
				System.out.println("I cannot afford, and I need to study more");
				System.out.println("I will go back to study more");
			}
			System.out.println("I keep writting some code");
			System.out.println("I keep writing more code");
		}
	}


