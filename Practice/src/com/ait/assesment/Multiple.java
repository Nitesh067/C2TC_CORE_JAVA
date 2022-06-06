package com.ait.assesment;
class A{
	void add() {
		System.out.println("Addition...");
	}
}
class B extends A{
	void sub() {
		System.out.println("subtraction...");
	}
}
class C extends A,B{
	void mult() {
		System.out.println("Multiplication...");
	}
	
}
public class Multiple {

	public static void main(String[] args) {
		C c = new C();
		c.mult();
		c.add();
		c.sub();
		

	}

}
