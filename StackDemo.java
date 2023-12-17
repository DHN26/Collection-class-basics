package com.collection.vector;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add("A");
		s.add(10);
		s.add('k');
		System.out.println(s);
		System.out.println(s.search('k'));
		

	}

}
