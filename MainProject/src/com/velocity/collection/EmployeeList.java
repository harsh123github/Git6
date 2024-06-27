package com.velocity.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	public static void main(String[]args) {
		List<Employee> emplist = new ArrayList<>();// loosely coupled
		emplist.add(new Employee(101, "Nayan",20000,"pune"));
		emplist.add(new Employee(102, "pratik",60000,"yavatmal"));
		emplist.add(new Employee(103, "Aayan",50000,"mumbai"));
		emplist.add(new Employee(104, "Rahul",40000,"delhi"));
		emplist.add(new Employee(105, "Akky",30000,"pune"));
		System.out.println(emplist);
	}

}
