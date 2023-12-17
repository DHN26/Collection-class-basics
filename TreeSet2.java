package com.collection.vector;
import java.util.TreeSet;
public class TreeSet2 {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<>();
		
		//internally jvm is using compareTo() in order to sort
		//the elements.
		t.add("B");
		t.add("Z");
		t.add("A");
		System.out.println(t);
		

	}

}
