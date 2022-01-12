package com.class2;
public class StudentInformation {
	public static void main(String args[]) {
		String firstName="AbdulWajid";
		String lastName="Ayoubi";
		char grade='A';
		String city="chantaly";
		String state="Virginia";
		long phoneNumber=5712771301l;
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		//we do not need to declare name by the string again they are arleady declared:
		
		firstName="Ayan";
		lastName="Ayoubi";
		grade='B';
		city="South Street";
		state="Washington";
		phoneNumber=5712771313L;
		System.out.println("My name is "+firstName);
		System.out.println("I live in the city of "+city);
		System.out.println("My Phone number is "+phoneNumber);
		
		
		
		
				
	}

}
