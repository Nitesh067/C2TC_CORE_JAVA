package com.statickkeyword;

public class Student1 {
	int rollno;
	String name;
	static String college="HKBK";
	Student1(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	static void change() {
		college="Atria";
	}

	public static void main(String[] args) {
		Student1 s1=new Student1(111,"Nitesh");
		change();
		s1.display();

	}

}
