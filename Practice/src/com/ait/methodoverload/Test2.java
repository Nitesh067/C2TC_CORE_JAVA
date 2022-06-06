package com.ait.methodoverload;
class Adderr{
	static int a(int a,int b) {
		return a+b;
	}
	static float a(float a,float b) {
		return a+b;
	}
}
public class Test2 {

	public static void main(String[] args) {
		System.out.println(Adderr.a(10, 40));
		System.out.println(Adderr.a(10.8f, 9.0f));

	}

}
