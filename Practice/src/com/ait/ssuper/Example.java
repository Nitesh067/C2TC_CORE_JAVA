package com.ait.ssuper;
class imal{
	String color="White";
}
class dog extends imal{
	void color() {
		System.out.println("Black");
		System.out.println(super.color);
	}
}
public class Example {

	public static void main(String[] args) {
		dog d = new dog();
		d.color();

	}
}

