package Practice_book;

import java.util.*;

public class StudentInfo {
	public ArrayList<String> changeOccurance(ArrayList<String> list, String m, String n) {
		ArrayList<String> list1 = new ArrayList<>();
		for (String s : list) {
			if (s.equals(m)) {
				list1.add(n);
			} else {
				list1.add(s);
			}
		}
		return list1;
	}

	public String listIndex(ArrayList<String> list) {
		return list.get(0);
	}

	public ArrayList<String> listAfter(ArrayList<String> list, String m, String n) {
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
		StudentInfo si = new StudentInfo();
		ArrayList<String> list = new ArrayList<>(
				Arrays.asList("rohan", "bankar", "kalpesh", "omkar", "rohan", "anish", "amol"));
		System.out.println(si.changeOccurance(list, "rohan", "kartik"));
		System.out.println(si.listIndex(list));
		System.out.println(si.listAfter(list, "rohan", "kartik"));

	}
}
