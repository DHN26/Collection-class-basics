package com.collection.vector;

import java.util.TreeSet;

public class MyComparatorApp2 {

	public static void main(String[] args) {
		TreeSet<Object> t=new TreeSet<>(new MyComparator2());
		t.add("Ambani");
		t.add("Zimbabwe");
		t.add("Canada");
		t.add("Manali");
		t.add("Man");
		System.out.println(t);

	}

}
