package com.ait.assesment;
class One{
	void a() {
		System.out.println("Class One");
	}
}
class Two extends One{
	void b() {
		System.out.println("Class Two");
	}
}
public class Sigle {

	public static void main(String[] args) {
		Two t = new Two();
		t.b();
		t.a();
		

	}

}
