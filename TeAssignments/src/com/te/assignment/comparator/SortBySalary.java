package com.te.assignment.comparator;


import java.util.Comparator;

public class SortBySalary implements Comparator<Employee1> {
	
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return (int) (o1.salary-o2.salary);
	}
}
