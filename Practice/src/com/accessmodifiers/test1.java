package com.accessmodifiers;

public class test1 {
	public int x=10;
	public void show() {
		System.out.println("Hello world");
	}
	public static void main(String args[]) {
		test1 t1=new test1();
		t1.show();
		System.out.println(t1.x);
		System.out.println("First class");
	}

}
