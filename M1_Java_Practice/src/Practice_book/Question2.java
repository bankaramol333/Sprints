package set3and4;

import java.util.*;

class InputLimit extends Exception {
	public InputLimit(String msg) {
		super(msg);
	}
}

public class Question2 {
	public static String createString(String s) {
		StringBuilder sb = new StringBuilder();
		s = s.toLowerCase();
		for (int i = s.length() - 1; i >= 0; i++) {
			if (i == s.length()) {
				sb.append((char) (s.charAt(i) - 32));
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try {
			if (s.length() > 200) {
				throw new InputLimit("Java repeated" + s.length() + "characters");
			} else if (s.length() == 0) {
				throw new InputLimit("length zero");
			}
		} catch (InputLimit e) {
			System.out.println(e.getMessage());
		}
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int l = 0;
		for (i = 0; i < s.length(); i++) {
			String m = "";
			if (i < s.length() && s.charAt(i) == ' ') {
				m = Question2.createString(s.substring(l, i));
				l = i + 1;
				sb.append(m + " ");
			}
		}
		String m = sb.toString();
		String[] a = new String[i - 1];
		int k = 0;
		for (int j = 0; j < m.length(); j++) {
			if (j < m.length() && m.charAt(j) == ' ') {
				a[j] = m.substring(k, j);
				k = j + 1;
			}

		}
		ArrayList<String> list = new ArrayList<>();
		for (i = 0; i < a.length; i++) {
			boolean x = false;
			for (int o = i + 1; o < a.length; o++) {
				if (a[i].equals(a[o])) {
					x = true;
				}
			}
			if (!x) {
				list.add(a[i]);
			}
		}
		System.out.println(list);

	}
}
