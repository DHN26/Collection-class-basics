package com.collection.vector;

import java.util.TreeSet;

public class MyComparatorApp3 {

	public static void main(String[] args) {
		TreeSet<Object> t=new TreeSet<>(new MyComparator3());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add("ABCD");
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("A");
		System.out.println(t);

	}

}
