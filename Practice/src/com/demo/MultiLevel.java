package com.demo;

class GrandFather{
	void surname() {
		System.out.println("Kumar");
	}
}
class father extends GrandFather{
	void property() {
		System.out.println("Property");
	}
}
class me extends father{
	void name() {
		System.out.println("Name");
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		me m = new me();
		m.surname();
		m.property();
		m.name();

	}

}
