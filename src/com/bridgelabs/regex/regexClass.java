package com.bridgelabs.regex;

public class regexClass {
	public static void main(String[] args) {
		
		String Uc4="^[91]{2}\s[0-9]{10}";
		String  num="91 8928877307";
		if(num.matches(Uc4))
		{
			System.out.println("Valid mob no  ");
		}
		else {
			System.out.println("Not valid mob no");
		}
		
	}
}
