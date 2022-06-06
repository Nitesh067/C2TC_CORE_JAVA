package com.ait.methodoverload;
class Adder{
	static int add(int a, int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class Test {

	public static void main(String[] args) {
		System.out.println(Adder.add(10, 30));
		System.out.println(Adder.add(20, 40,10));

	}

}
