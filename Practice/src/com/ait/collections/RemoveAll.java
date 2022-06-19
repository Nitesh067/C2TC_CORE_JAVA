package com.ait.collections;
import java.util.List;
import java.util.ArrayList;
public class RemoveAll {

	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		List <Integer> al2 = new ArrayList<>();
		al2.add(30);
		al2.add(40);
		al.removeAll(al2);
		System.out.println(al);

	}

}
