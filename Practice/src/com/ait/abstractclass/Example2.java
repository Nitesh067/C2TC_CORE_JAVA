package com.ait.abstractclass;
abstract class Shape{
	abstract void draw();
}
class rectangle extends Shape{
	void draw() {
		System.out.println("Draw a rectangle...");
	}
}
class circle extends rectangle{
	void draw() {
		System.out.println("Draw a circle...");
	}
}
public class Example2 {

	public static void main(String[] args) {
		Shape s = new rectangle();
		rectangle r = new circle();
		s.draw();
		r.draw();
	

	}

}
