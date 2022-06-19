package com.ait.abstractclass;
final abstract class dress{
	abstract void type();
}
class menswear extends dress{
	void type()
	{
		System.out.println("It is a men's wear");
	}
}
public class Main {

	public static void main(String[] args) {
		menswear m = new menswear();
		m.type();

	}

}
