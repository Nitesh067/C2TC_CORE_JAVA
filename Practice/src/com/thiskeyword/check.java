package com.thiskeyword;

public class check {
	check(){
		System.out.println("Constructor non-parameterized");
	}
	check(int x){
		this();
		System.out.println("Constructor with parameter"+x);
	}

	public static void main(String args[]) {
		check c = new check(10);
		
	}

}
