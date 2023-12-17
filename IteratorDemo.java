package com.collection.vector;
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo {

	public static <E> void main(String[] args) {
		ArrayList l=new ArrayList();
		for(int i=0;i<10;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		Iterator<E> i=l.iterator();
		while(i.hasNext())
		{
			Integer itr=(Integer)i.next();
			if(itr%2==0)
				System.out.print(itr+" ");
			else
				i.remove();
		}
		System.out.println();
		System.out.println(l);
		System.out.println(i);
	}

}
