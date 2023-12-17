package com.collection.vector;
import java.util.*;
public class VectorDemo1 {

	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		Vector v=new Vector(10,2);
		System.out.println("Old capacity : "+v.capacity());
		
		
		for(int i=10;i<=20;i++)
		{
			v.addElement(i);
		}
		
		v.addElement("Hello");
		System.out.println("New capacity : "+v.capacity());
		
		v.removeElement(14);
		v.removeElementAt(8);
		
		for(int i=0;i<10;i++)
		{
			System.out.print(v.elementAt(i)+" ");
		}
		System.out.println();
		System.out.println("First element : "+v.firstElement());
		System.out.println("Vector : "+v);

	}

}
