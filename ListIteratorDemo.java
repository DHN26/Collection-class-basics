package com.collection.vector;
import java.util.LinkedList;
import java.util.ListIterator;
public class ListIteratorDemo {

	public static void main(String[] args) {
		//LinkedList l=new LinkedList();
		LinkedList<Object> l = new LinkedList<>();
		l.add("Akash Gupta");
		l.add(99);
		l.add("Kenny");
		l.add(1.23);
		l.add("Rajshekhar");
		
		l.set(0, "Chandler Bing:)");
		System.out.println(l);
		
		ListIterator<Object> ll=l.listIterator();
		while(ll.hasNext())
		{
			Object element = ll.next();
            if (element instanceof String) 
            {
                String s = (String) element;
			if(s.equals("Rajshekhar"))
				l.set(4, "Rajshekhar Mamidana");
            }
			System.out.println(ll.nextIndex());
			if(ll.nextIndex()==1)
				ll.add("Varun Grover");
				
		}
		
		System.out.println(l);
		System.out.println(ll);
		System.out.println(ll.getClass().getName());
		

	}

}
