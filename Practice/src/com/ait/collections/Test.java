package com.ait.collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Test {

	public static void main(String[] args) {
		List <Integer> al = new ArrayList<>();
		al.add(10);
		al.add(120);
		al.add(20);
		al.add(10+10);
		
		for(Integer e:al)
		{
			System.out.print(e);
		}
		System.out.println("ArrayList :"+al);
		

	}

}
