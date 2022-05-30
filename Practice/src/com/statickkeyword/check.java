package com.statickkeyword;

public class check {
	int rollno;
	String name;
	static String college="HKBK";
	static {
		System.out.println("Static block executed first");
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	static void change() {
		college="Atria";
		
	}
	check(int r, String n){
		rollno=r;
		name=n;
	}
	public static void main(String args[]) {
		check c = new check(111,"Nitesh");
		change();
		c.display();
	}

}
