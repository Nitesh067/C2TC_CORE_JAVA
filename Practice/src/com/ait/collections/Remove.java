package com.ait.collections;
import java.util.List;
import java.util.ArrayList;
public class Remove {

	public static void main(String[] args) {
		List <Integer> val = new ArrayList<>();
		val.add(10);
		val.add(20);
		val.add(30);
		val.add(40);
		val.remove(2);

		System.out.println(val);
	}

}
