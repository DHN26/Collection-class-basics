package com.collection.vector;

public class MyComparatorr {
	public int compare(Object o1,Object o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		String s1=e1.ename;
		String s2=e2.ename;
		return s2.compareTo(s1);
	}
}
