package InClass;

import java.util.*;

public class RemoveDuplicate {
	public static String Duplicate(String str) {
		StringBuilder sb = new StringBuilder();

		Map<Character, Integer> st = new HashMap<>();

		char[] s = str.toCharArray();

		for (int i = 0; i < s.length; i++) {
			if (!st.containsKey(s[i])) {
				st.put(s[i], 1);
			} else {
				int x = st.get(s[i]);
				x++;
				st.put(s[i], x);
			}
		}
		for (Map.Entry<Character, Integer> pair : st.entrySet()) {
			if (pair.getValue() % 2 != 0) {
				sb.append(pair.getKey());
//				sb.append(pair.getValue());
			}
		}

		return sb.toString();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String para = sc.nextLine();
		String Result = Duplicate(para);
		System.out.println(Result);
		sc.close();
	}

}
