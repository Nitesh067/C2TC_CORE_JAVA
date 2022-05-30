package com.thiskeyword;

public class hello {
	hello(){
		this(10);
		System.out.println("Hello a");
	}
	hello(int x){
		System.out.println(x);
	}
	public static void main(String args[]) {
		hello h = new hello();
	}

}
