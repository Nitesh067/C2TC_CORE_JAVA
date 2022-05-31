package com.stringmethod;

public class indexOf {

	public static void main(String[] args) {
		String s="Hello everyone how are you doing!!!";
		int index=s.indexOf("Hello");
		System.out.println(index);
		int index1=s.indexOf(" ");
		System.out.println(index1);
		int index2=s.indexOf("doing");
		System.out.println(index2);
		int index3=s.indexOf('u',4);
		System.out.println(index3);
		int index4=s.indexOf("lol",4);
		System.out.println(index4);

	}

}
