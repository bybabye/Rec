package REFACTOR;

public class coder extends Employee {
	
	int level;

	public void computeSalary() {
		System.out.println("The salary of Coder");
	}
}

class Manager extends Employee  {
	

	public int computeSalary() {
		return 20000000;
	}
}

class Employee {
	String Name;
	String ID;
}
