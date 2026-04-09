package InClass;

import java.util.*;

class StringVowelException extends Exception {
	public StringVowelException(String msg) {
		super(msg);
	}
}

public class Multi {

	public static String checkString(String s) throws StringVowelException {
		Set<Character> st = new HashSet<>();
		st.add('a');
		st.add('e');
		st.add('i');
		st.add('o');
		st.add('u');
		for (char c : s.toCharArray()) {
			if (st.contains(c)) {
				return "contains Vowel";
			}
		}
		throw new StringVowelException("NO Vowel in String");

	}

	public static void main(String[] args) {
		try {
			System.out.println(checkString("ytsp"));
		} catch (StringVowelException e) {
			System.out.println(e.getMessage());
		}
	}
}