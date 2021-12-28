package uc5;

public class Employee implements Comparable<Employee>{

	String empName;
	double empSalary;
	
	public Employee(String empName, double empSalary) {
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public int compareTo(Employee e) {
		if(this.empSalary>e.empSalary) {
			return 1;
		} else {
			return 0;
		}
	}
}