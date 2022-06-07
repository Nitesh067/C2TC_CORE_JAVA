package com.ait.abstractclass;
abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	void run() {
		System.out.println("Bike is running...");
	}
}
public class Example {

	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();

	}

}
