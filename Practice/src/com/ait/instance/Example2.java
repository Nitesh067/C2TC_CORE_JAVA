package com.ait.instance;
class father{
	void name() {
		System.out.println("father class...");
	}
}
class son extends father{
	void surname() {
		System.out.println("son class...");
	}
}
public class Example2 {

	public static void main(String[] args) {
		son s = new son();
		s=null;
		System.out.println(s instanceof father);

	}

}
