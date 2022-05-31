package com.stringmethod;

public class LastIndex {

	public static void main(String[] args) {
		String s="Hello everyone what's going on";
		int index=s.lastIndexOf('o');
		System.out.println(index);
		int index1=s.lastIndexOf('o',10);
		System.out.println(index1);
		int index2=s.lastIndexOf("lol",5);
		System.out.println(index2);

	}

}
