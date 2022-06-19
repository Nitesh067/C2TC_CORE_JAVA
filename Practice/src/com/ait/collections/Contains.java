package com.ait.collections;
import java.util.List;
import java.util.ArrayList;
public class Contains {

	public static void main(String[] args) {
		List <String> s = new ArrayList<>();
		s.add("Pencil");
		s.add("Pen");
		s.add("Lol");
		s.add("Nitesh");
		boolean b = s.contains("Pen");
		System.out.println(b);

	}

}
