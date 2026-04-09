package Practice_book;

class Employee {
	String name;
	String ssn;
	String dept;
	int sal;

	public Employee(String name, String ssn, String dept, int sal) {
		this.name = name;
		this.ssn = ssn;
		this.dept = dept;
		this.sal = sal;
	}
}

class EmployeeImplementation {
	public Employee getEmployeeInfo(String str) {
		String name;
		String ssn;
		String dept;
		int sal;
		String arr[] = str.split("[#\\-@]");
		name = arr[0];
		ssn = arr[1];
		dept = arr[2];
		System.out.println(arr[1]);
		sal = Integer.parseInt(arr[3]);
		Employee emp = new Employee(name, ssn, dept, sal);
		return emp;
	}

	public String getEDept(Employee emp) {
		int len = emp.ssn.length();

		String ssn1 = emp.ssn.substring(len - 3);
		int x = Integer.parseInt(ssn1);
		if (x >= 0 && x <= 60)
			return "L1";
		if (x >= 61 && x <= 120)
			return "L2";
		if (x >= 121 && x <= 180)
			return "L3";
		if (x >= 180)
			return "L4";

		return "";
	}
}

public class Employee_Info {
	public static void main(String[] args) {
		EmployeeImplementation impl = new EmployeeImplementation();
		Employee emp;
		emp = impl.getEmployeeInfo(" Amit Rai@1PC16CS246-ALU#08");
		System.out.printf(emp.dept + " " + emp.name + " " + emp.sal + " " + emp.ssn);
		System.out.println();
		System.out.println(impl.getEDept(emp));
	}
}
