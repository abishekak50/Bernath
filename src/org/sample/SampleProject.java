package org.sample;

public class SampleProject {

	class Employee {
		int eid;
		String ename;
		double salary;

		Employee(int eid, String ename, double salary) {
			this.eid = eid;
			this.ename = ename;
			this.salary = salary;
		}

		private void display() {
			System.out.println("Eid :" + eid);
			System.out.println("Ename :" + ename);
			System.out.println("Esalary :" + salary);
		}

	}

	class Manager {

	}
}
