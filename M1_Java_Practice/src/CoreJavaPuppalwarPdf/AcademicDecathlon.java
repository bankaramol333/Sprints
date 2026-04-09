package CoreJavaPuppalwarPdf;

import java.util.*;

public class AcademicDecathlon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int arr[] = new int[y];
		for (int i = 0; i < y; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int res = 0, ct = 1;
		for (int i = 1; i < y; i++) {
			if (arr[i] - 1 == arr[i - 1]) {
				ct++;
			} else {
				res = Math.max(res, ct);
				ct = 1;
			}
		}
		res = Math.max(res, ct);
		System.out.println(res);
		sc.close();
	}
}
