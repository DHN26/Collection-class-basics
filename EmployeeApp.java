package com.collection.vector;

import java.util.TreeSet;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee e1=new Employee("Ravi",101);
		Employee e2=new Employee("Ramesh",102);
		Employee e3=new Employee("Satish",103);
		Employee e4=new Employee("Abhi",104);
		Employee e5=new Employee("Zameer",105);
		
		TreeSet<Object> t1=new TreeSet<>();
		t1.add(e1);
		t1.add(e2);
		
		TreeSet<Object> t2=new TreeSet<>(new MyComparatorr());
		t2.add(e3);
		t2.add(e4);
		
		
		

	}

}
