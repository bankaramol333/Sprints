package CoreJavaPuppalwarPdf;

import java.util.*;

public class BeautifulString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean x = true;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1) || s.charAt(i - 1) - 'a' == s.charAt(i) - 'a' - 1) {
				x = false;
				break;
			}
		}
		System.out.println(x == true ? "beautiful" : "not beautiful");
		int ct = 0;
		int res = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1) || s.charAt(i - 1) - 'a' == s.charAt(i) - 'a' - 1) {
				ct++;
				i++;
				while (s.length() > i
						&& (s.charAt(i) == s.charAt(i - 1) || s.charAt(i - 1) - 'a' == s.charAt(i) - 'a' - 1)) {
					ct++;
					i++;
				}
				res += (ct == 1 ? 1 : (ct % 2 == 0 ? ct / 2 : (ct / 2 + 1)));
				ct = 0;
				i--;
			}
		}
		System.out.println(res);
	}
}
