package com.ait.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Add {

	public static void main(String[] args) {
		List <Integer> val = new ArrayList<>();
		val.add(10);
		val.add(0);
		val.add(100);
		Iterator z = val.iterator();
		while(z.hasNext())
		{
			System.out.print(z.next());
		}
		System.out.println(val);
		

	}

}
