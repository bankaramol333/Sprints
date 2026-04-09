package Practice_book;

import java.util.*;

public class Source {
	public String printIndex(ArrayList<String> list, int idx) {
		return list.get(idx);
	}

	public ArrayList<String> addAfter(ArrayList<String> l, String m, String n) {
		ArrayList<String> l1 = new ArrayList<>();
		for (String s : l) {
			if (s.equals(m)) {
				l1.add(s);
				l1.add(n);
			} else {
				l1.add(s);
			}
		}
		return l1;
	}

	public ArrayList<String> pickIndexAndAppend(ArrayList<String> p, int ind) {
		ArrayList<String> l1 = new ArrayList<>();
		int ct = 0;
		for (String s : p) {
			if (ct == ind) {
				ct++;
			} else {
				l1.add(s);
				ct++;
			}
		}
		l1.add(p.get(ind));
		return l1;
	}

	public static void main(String[] args) {
		Source obj = new Source();
		ArrayList<String> list = new ArrayList<>();
		list.add("breaking ");
		list.add("sheldon");
		list.add("friends");
		list.add("sherlock ");
		list.add("stranger ");
		System.out.println(obj.printIndex(list, 0));
		System.out.println(obj.addAfter(list, "friends", "fast and frs"));
		System.out.println(obj.pickIndexAndAppend(list, 1));

	}
}
