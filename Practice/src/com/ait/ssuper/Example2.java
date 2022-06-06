package com.ait.ssuper;
class Amal{
	void eat() {
		System.out.println("Animal Class");
	}
}
class cat extends Amal{
	void eat() {
		System.out.println("Dog class");
	}
	void bark() {
		System.out.println("Bark");
	}
	void run() {
		super.eat();
		bark();
	}

}
public class Example2 {

	public static void main(String[] args) {
		cat d = new cat();
		d.run();
		

	}

}
