package InClass;

import java.util.*;

class Employee {
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void Display() {
		System.out.println(id + " " + name);
	}
}

public class ArrayofObject {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Employees: ");
		int a = sc.nextInt();
		Employee[] arr = new Employee[a];

		for (int i = 0; i < a; i++) {
			System.out.println("Enter Id & Name of Employee " + i);
			int x = sc.nextInt();
			sc.nextLine();
			String y = sc.nextLine();
			arr[i] = new Employee(x, y);

		}
		for (int i = 0; i < a; i++) {
			System.out.println("Id & Name of Employee is " + arr[i].id + arr[i].name);

		}
		sc.close();
	}
}
