package com.statickkeyword;

public class Demo {
	static{
		System.out.println("Static block executed first");
	}

	public static void main(String[] args) {
		System.out.println("Main method block executed after static");
	

	}

}
