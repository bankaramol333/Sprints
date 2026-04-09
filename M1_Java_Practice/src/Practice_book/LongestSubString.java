package Practice_book;

import java.util.*;

public class LongestSubString {
	public int lengthOfLongestSubstring(String s, HashSet<Character> set) {
		int mx = 0;
		char arr[] = s.toCharArray();
		int ct = 0;
		for (char c : arr) {
			if (!set.contains(c)) {
				set.add(c);
				ct++;
			} else {
				mx = Math.max(ct, mx);
				ct = 0;
				set.clear();
			}
			mx = Math.max(ct, mx);
		}
		
		return mx;
	}

	public static void main(String[] args) {
		LongestSubString lsb = new LongestSubString();
		HashSet<Character> set = new HashSet<>();
		System.out.println(lsb.lengthOfLongestSubstring("abcdefjjsabcdfghjklpoi", set));
	}
}
