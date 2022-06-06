package com.ait.inheritance;
class Father{
	void sarname() {
		System.out.println("Surname of Father");
	}
}
class son extends Father{
	void Surname() {
		System.out.println("Surname of Son");
	}
}
class doughter extends son{
	void surname() {
		System.out.println("Surname of Doughter..");
	}
}
public class Hierarichal {

	public static void main(String[] args) {
		doughter d = new doughter();
		d.sarname();
		d.Surname();
		d.surname();

	}

}
