package refactor5;

public class Instructor extends Person {
	
	int yearOfExp;

	public Instructor() {
		// TODO Auto-generated constructor stub
	}

	public int getSalary() {
		return 1;
	}
}

class Student extends Person {
	
	String ClassName;

	public Student() {
		
	}

	public int getScholarship() {
		return 1;
	}
}

class Person {
	String Id;
	String name;
	Person(){}
}
