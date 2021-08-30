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
		
		String lastName="Pri";
		if(lastName.matches(Uc1))
		{
			System.out.println("Valid Last name ");
		}
		else {
			System.out.println("Not valid last name");
		}
		
		String Uc3="[a-zA-Z0-9.]{1,}[@][a-z]{2,}[.][a-z]{2,3}[.][a-z]{2,3}";
		String email="pritesh.212@gmail.co.in";
		if(email.matches(Uc3))
		{
			System.out.println("Valid email  ");
		}
		else {
			System.out.println("Not valid emailId");
		}
		
		String Uc4="^[91]{2}\s[0-9]{10}";
		String  num="91 8928877307";
		if(num.matches(Uc4))
		{
			System.out.println("Valid mob no  ");
		}
		else {
			System.out.println("Not valid mob no");
		
		}
		String Uc5="[a-zA-Z]{8,}";
		String  pass="priteshraj";
		if(pass.matches(Uc5))
		{
			System.out.println("Valid pass  ");
		}
		else {
			System.out.println("Not valid pass");
		}
		
	}
}
