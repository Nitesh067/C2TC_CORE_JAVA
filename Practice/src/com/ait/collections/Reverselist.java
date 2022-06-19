package com.ait.collections;
import java.util.*;
public class Reverselist {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("vijay");
		ll.add("Shingh");
		ll.add("Chauhan");
		Iterator i = ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
