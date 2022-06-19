package com.ait.collections;
import java.util.*;
public class PeekFirst {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("GEM");
		ll.add(4);
		ll.add("Grey");
		ll.add(8);
		System.out.println("Original List "+ll);
		System.out.println("After using PeekFirst "+ll.peekFirst());
		System.out.println("After using PeekFirst "+ll.peekLast());
	}

}
