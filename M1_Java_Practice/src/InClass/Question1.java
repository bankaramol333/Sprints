package InClass;

import java.util.*;

public class Question1 {
	public static int digitSum(int x) {
		int sum = 0;
		while (x > 0) {
			int rem = x % 10;
			x /= 10;
			sum += rem;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int e = 0, o = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int y = digitSum(arr[i][j]);
				if (y % 2 == 0) {
					e += y;
				} else {
					o += y;
				}
			}
		}
		System.out.println(e + " " + o);
		sc.close();
	}
}
