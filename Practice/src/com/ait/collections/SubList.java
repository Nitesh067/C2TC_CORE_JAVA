package com.ait.collections;
import java.util.List;
import java.util.ArrayList;
public class SubList {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(10);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		System.out.println("Actual ArrayList "+ar);
		List <Integer> al =ar.subList(0, 3);
		System.out.println("Sub lists is"+al);

	}

}
