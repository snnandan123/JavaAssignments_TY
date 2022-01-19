package com.te.assignment.comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Employee1Test{
	public static void main(String[] args) {
		
		ArrayList<Employee1> lists=new ArrayList<Employee1>();
		lists.add(new Employee1(85,"Raj",65754.23));
		lists.add(new Employee1(93,"Vishnu",46532.36));
		lists.add(new Employee1(45,"Ambi",35442.44));
		lists.add(new Employee1(65,"Rajani",76978.98));
		lists.add(new Employee1(87,"Ravi",54534.99));
		
		System.out.println("==Before sorting==");
		Iterator<Employee1> iterator=lists.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--------------------------");
		System.out.println("Enter 1 to sort by Id\nEnter 2 to sort by Name\nEnter 3 to sort by Salary");
		System.out.println("--------------------------");
		Scanner scan=new Scanner(System.in);
		int option=scan.nextInt();
		scan.close();
		switch(option) {
		case 1:System.out.println("==Sorting ID==");
			   new SortById();
		               Collections.sort(lists, new SortById());
			   break;
			   
		case 2:System.out.println("==Sorting Name=="); 
			   new SortByName();
		                Collections.sort(lists, new SortByName());
		               break;
		       
		case 3:System.out.println("==Sorting Salary==");
			   new SortBySalary();
		                 Collections.sort(lists, new SortBySalary());
		               break;
		       
		default:System.out.println("Invalid option!!");  
		         System.exit(0);
		}
		
		for(Employee1 employee1:lists) {
		      System.out.println(employee1);
	                      }
	           }	
	}


