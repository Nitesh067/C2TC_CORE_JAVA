package com.stringmethod;

public class test1 {
	public static void main(String args[]) {
		String s1="Hello";
		String s2="Hello";
		String str=new String("Hello");
		String str1=new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s1==str);
		System.out.println(str==str1);
	}

}
