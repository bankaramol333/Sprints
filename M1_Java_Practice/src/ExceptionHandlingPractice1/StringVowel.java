package ExceptionHandlingPractice1;

import java.io.Serializable;
import java.util.*;

class StringVowelException extends Exception {
	public StringVowelException(String msg) {
		super(msg);
	}
}

public class StringVowel {

	public static String checkString(String s) throws StringVowelException {
		Set<Character> st = new HashSet<>();
		st.add('a');
		st.add('e');
		st.add('i');
		st.add('o');
		st.add('u');
		for (char c : s.toCharArray()) {
			if (st.contains(c)) {
				return "Contains Vowel";
			}
		}
		throw new StringVowelException("No vowel in string");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		try {
			System.out.println(checkString(s));
		} catch (StringVowelException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
