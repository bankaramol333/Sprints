package InClass;

import java.util.*;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		List<Integer> Even = new ArrayList<>();
		List<Integer> Odd = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) {

				sum = sum + i;
				Even.add(i);

			} else
				Odd.add(i);
		}
		System.out.println("Even Numbers are ");
		for (int i : Even) {
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.println("Sum is  " + sum);

		System.out.println("Odd Numbers are ");
		for (int i : Odd) {
			System.out.print(" " + i);
		}
		sc.close();
	}

}
