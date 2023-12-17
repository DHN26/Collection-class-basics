package com.collection.vector;
import java.util.TreeSet;
public class MyComparatorApp {

	public static void main(String[] args) {
		TreeSet<Object> t=new TreeSet<>(new MyComparator());
		t.add(0);
		t.add(5);
		t.add(10);
		t.add(-5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}

}
