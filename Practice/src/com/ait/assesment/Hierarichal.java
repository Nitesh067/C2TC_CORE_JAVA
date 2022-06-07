package com.ait.assesment;
class Father{
	void color() {
		System.out.println("father class...");
	}
}
class son extends Father{
	void height() {
		System.out.println("Son class...");
	}
}
class daughter extends Father{
	void pitch() {
		System.out.println("Daughter class...");
	}

	void height() {
		
		
	}
}
public class Hierarichal {

	public static void main(String[] args) {
		daughter dt = new daughter();
		dt.color();
		dt.height();
		dt.pitch();
		
		
		

	}

}
