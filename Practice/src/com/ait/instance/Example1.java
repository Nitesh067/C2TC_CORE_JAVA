package com.ait.instance;
class demo{
	void a() {
		System.out.println("Hello");
	}
}
public class Example1 {

	public static void main(String[] args) {
		Example1 ex = new Example1();
		demo d = new demo();
		System.out.println(d instanceof demo);

	}

}
