package com.bridgelabs.regex;

public class regexClass {
	public static void main(String[] args) {
		String Uc1= "^[A-Z][a-zA-z]{2,}";
		String name="Pri";
		if(name.matches(Uc1))
		{
			System.out.println("ok");
		}
		else {
			System.out.println("Not ok");
		}

		
	}
}
