package InClass;

import java.util.*;

class DuplicateException extends Exception {
	public DuplicateException(String msg) {
		super(msg);
	}
}

public class Dupli {
	public static String CheckDuplicate(ArrayList<Integer> list) throws DuplicateException {
		Set<Integer> st = new HashSet<>();
		for (int i : list) {
			if (!st.contains(i)) {
				st.add(i);
			} else {
				throw new DuplicateException("Dupliacte Found");
			}
		}
		return "Duplicate not found";
	}

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1, 1, 3, 4));
		try {
			System.out.println(CheckDuplicate(num));
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
		}
	}
}
