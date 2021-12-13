package com.hexa.emp;

public class Employee {
	static int eid;
	static String ename;
	static int salary;

	public Employee(int eid, String ename, int salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;

	}

	private void display() {
		System.out.println("Eid :" + eid);
		System.out.println("Ename :" + ename);
		System.out.println("salary:" + salary);
	}
}
