package com.te.assignment.comparator;


public class Employee1{
		int id;
		String name;
		double salary;
		
		public Employee1(int id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		
	}
