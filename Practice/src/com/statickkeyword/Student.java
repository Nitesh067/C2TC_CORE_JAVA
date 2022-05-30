package com.statickkeyword;

public class Student {
	int rollno;
	String name;
	static String college="AIT";
	Student(int r, String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args) {
		Student s1=new Student(111,"Nitesh");
		Student s2=new Student(122,"Kumar");
		s1.display();
		s2.display();
		
		

	}

}
