package com.velocity.collection;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {
		// TODO Auto-generated method stub
		if(obj1.getSalary()>obj2.getSalary()) {
		return 1;
	}
		else if(obj1.getSalary()<obj2.getSalary()) {
			return -1;
		}
		else {
			return 0;

}
	}
}


