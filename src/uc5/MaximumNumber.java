package uc5;

public class MaximumNumber< T extends Comparable<T>> {
	
	public T findMax(T x, T y, T z) {
		T max = x;
	
		if(y.compareTo(max) >= 1) {
			max = y;
		}
		if(y.compareTo(max) >= 1) {
			max = y;
		}
		return max;
	}
	
	public static void main(String[] args) {
		String stringX = "Zello", stringY = "world", stringZ = "zjbkdlcasghcfx";

		MaximumNumber<String> maxInt = new MaximumNumber<String>();
		System.out.println(maxInt.findMax(stringX, stringY, stringZ));

		Employee emp1 = new Employee("Emp1", 100000);
		Employee emp2 = new Employee("Emp2", 170000);
		Employee emp3 = new Employee("Emp3", 126000);
		System.out.println(emp1.empName +" ===  "+emp1.empSalary);
		MaximumNumber<Employee> findMaxEmp = new MaximumNumber<>();
		Employee maxSalaryEmp = findMaxEmp.findMax(emp1, emp2, emp3);

		System.out.println(maxSalaryEmp.empName + " is earning more salary (" + maxSalaryEmp.empSalary + " INR) ");
	}

}