package InClass;

import java.util.*;

public class DArray {
	public static void main(String[] args) {
		System.out.println("Enter no of Rows and Columns: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] arr = new int[a][b];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {

				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				sum += arr[i][j];
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {

				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}

		System.out.println("Sum is: " + sum + "max is: " + max + " min is: " + min);
		sc.close();
	}

}
