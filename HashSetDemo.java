package com.collection.vector;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Object> h=new HashSet<>();
		h.add("Hello");
		h.add(12);
		h.add("Welcome");
		h.add(null);
		h.add(3.147);
		System.out.println(h);
		System.out.println(h.add(12));
		System.out.println(h);
		h.remove(12);
		System.out.println(h);
		
		//constructors in hashset
//		HashSet<Object> h1=new HashSet<>();
//		HashSet<Object> h2=new HashSet<>(123);
//		HashSet<Object> h3=new HashSet<>(12,0.9f);
//		HashSet<Object> h4=new HashSet<>(Collection c);
	
		

	}

}
