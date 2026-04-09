package Practice_book;

import java.util.*;

public class StringPosition {
	public List<List<Integer>> printPosition(String s) {
		List<List<Integer>> list = new ArrayList<>();
		int i = 0, j = 1;
		int ct = 1;
		while (j < (s.length() - 1)) {
			if (s.charAt(i) == s.charAt(j)) {
				j++;
				ct++;
			} else {
				if (ct >= 3) {
					ArrayList<Integer> list1 = new ArrayList<>();
					list1.add(i);
					list1.add(j - 1);
					list.add(list1);
				}
				i = j;
				j++;
				ct = 1;
			}
		}
		if (ct >= 3) {
			ArrayList<Integer> list1 = new ArrayList<>();
			list1.add(i);
			list1.add(j - 1);
			list.add(list1);
		}
//		[[3, 8], [9, 12]] 

		return list;
	}

	public List<String> addAfter(List<String> list, String m, String n) {
		ArrayList<String> list1 = new ArrayList<>();
		for (String s : list) {
			if (s.equals(m)) {
				list1.add(s);
				list1.add(n);
			} else {
				list1.add(s);
			}
		}
		return list1;
	}

	public static void main(String[] args) {
		StringPosition sp = new StringPosition();
		System.out.println(sp.printPosition("mousssssseeeeddjhjbhhhdbbbggggggghhttttttmndhfnfhhhhhhh"));
		ArrayList<String> list = new ArrayList<>(
				Arrays.asList("ad", "cc", "df", "ez", "ab", "djdl", "cc", "hff", "cc"));
		System.out.println(sp.addAfter(list, "cc", "kc"));

	}
}
