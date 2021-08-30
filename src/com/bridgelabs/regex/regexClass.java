package com.bridgelabs.regex;

public class regexClass {
	public static void main(String[] args) {
		String Uc3="[a-zA-Z0-9.]{1,}[@][a-z]{2,}[.][a-z]{2,3}[.][a-z]{2,3}";
		String email="pritesh.212@gmail.co.in";
		if(email.matches(Uc3))
		{
			System.out.println("Valid email  ");
		}
		else {
			System.out.println("Not valid emailId");
		}
		
	}
}
