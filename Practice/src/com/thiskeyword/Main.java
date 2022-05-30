package com.thiskeyword;

class s2{
	void m(s2 a) {
		System.out.println("Method is invoked");
	}
	void p() {
		m(this);
	}
}
public class Main {
	public static void main(String args) {
		s2 s = new s2();
		s.p();
	}

}
