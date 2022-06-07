package com.ait.abstractclass;
abstract class motor{
	motor(){
		System.out.println("motor is running...");
	}
	abstract void run();
	void gearChanged() {
		System.out.println("Gear changed...");
	}
}
class Hondaa extends motor{
	void run() {
		System.out.println("Running safely...");
	}
}
public class Example4 {
	public static void main(String args[]) {
		Hondaa h = new Hondaa();
		h.run();
		h.gearChanged();
	}

}
