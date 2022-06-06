package com.ait.assesment;

public class MethodOverloading {
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		System.out.println(mo.add(10, 38));
		System.out.println(mo.add(50, 30, 20));

	}

}
