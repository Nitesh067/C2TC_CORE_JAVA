package com.ait.collections;
import java.util.*;
public class Peak {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add("Nitesh");
		ll.add(100);
		ll.add("Rahul");
		System.out.println("The initial list"+ll);
		System.out.println("After using peek "+ll.peek());
	}

}
