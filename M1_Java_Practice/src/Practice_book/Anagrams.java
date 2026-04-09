package Practice_book;

import java.util.*;

public class Anagrams {

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<>();
		HashMap<Character, Integer> map = new HashMap<>();
		char arr[] = p.toCharArray();
		Arrays.sort(arr);
		for (char c : arr) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		for (int i = 0; i < (s.length() - p.length()); i++) {
			char arr1[] = s.substring(i, i + p.length()).toCharArray();
			Arrays.sort(arr1);
			boolean x = true;
			for (int j = 0; j < p.length(); j++) {
				if (arr[j] != arr1[j]) {
					x = false;
					break;
				}
			}
			if (x) {
				list.add(i);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		Anagrams an = new Anagrams();
		String s1 = "cbaebabacdabchfkabchfkabc";
		System.out.println(an.findAnagrams(s1, "abc"));
	}
}
