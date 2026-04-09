package Practice_book;

import java.util.*;

public class SetOperation {

	public Set<Integer> subtract(Set<Integer> s1, Set<Integer> s2) {
		Set<Integer> s3 = new HashSet<Integer>();
		for (int x : s1) {
			if (s2.contains(x)) {
				continue;
			} else {
				s3.add(x);
			}
		}
		return s3;

	}

	public Set<Integer> union(Set<Integer> s1, Set<Integer> s2) {
		HashSet<Integer> s3 = new HashSet<>(s1);
		s3.addAll(s2);
		return s3;
	}

	public Set<Integer> intersection(Set<Integer> s1, Set<Integer> s2) {
		Set<Integer> s3 = new HashSet<>();
		for (int x : s1) {
			if (s2.contains(x)) {
				s3.add(x);
			}
		}
		return s3;
	}

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		s1.add(1);
		s1.add(2);
		s1.add(5);
		s1.add(8);
		s1.add(9);
		s1.add(12);
		s2.add(8);
		s2.add(6);
		s2.add(4);
		s2.add(3);
		s2.add(12);
		s2.add(15);
		SetOperation so = new SetOperation();

		System.out.println(so.subtract(s1, s2));
		System.out.println(so.union(s1, s2));
		System.out.println(so.intersection(s1, s2));
	}
}
