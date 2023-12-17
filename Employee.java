package com.collection.vector;

public class Employee implements Comparable{
	
	String ename;
	int eid;
	
	public Employee(String ename, int eid) {
		super();
		this.ename = ename;
		this.eid = eid;
	}

	public int compareTo(Object o)
	{
		int eid1=this.eid;
		Employee e=(Employee)o;
		int eid2=e.eid;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return 1;
		else
			return 0;
	}
}
