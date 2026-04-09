package InClass;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter an integer:");
		int id = in.nextInt();
//        in.nextLine(); // Consume the leftover newline
//
//        System.out.println("Enter a name:");
		String name = in.nextLine();

		System.out.println("ID: " + id + ", Name: " + name);
		in.close();
	}
}
