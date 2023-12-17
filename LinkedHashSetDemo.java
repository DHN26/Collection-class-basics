package com.collection.vector;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Object> l=new LinkedHashSet<>();
		l.add("Hello");
		l.add(120);
		l.add(null);
		l.add(true);
		System.out.println(l.add(120));
		System.out.println(l);

	}

}
