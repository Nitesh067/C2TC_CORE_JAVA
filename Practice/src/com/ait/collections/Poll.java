package com.ait.collections;
import java.util.*;
public class Poll {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("GEM");
		ll.add(4);
		ll.add("GREY");
		ll.add(8);
		System.out.println("The original list "+ll);
		System.out.println(ll.poll());
		System.out.println("The linked list is "+ll);
		

	}

}
