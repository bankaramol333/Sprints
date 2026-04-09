package InClass;

import java.util.*;
import java.util.regex.*;

public class Regex {

	public static final Pattern PHONE = Pattern.compile("^(?:\\+91\\s?\\d{3}-\\d{3}-\\d{3}|\\d{3}\\.\\d{3}\\.\\d{3})$");

	public static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

	public static final Pattern PASSWORD = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your string: ");
		String input = sc.nextLine().trim();

		if (PHONE.matcher(input).matches()) {
			System.out.println("Valid phone format");
		} else if (EMAIL_PATTERN.matcher(input).matches()) {
			System.out.println("Valid email");
		} else if (PASSWORD.matcher(input).matches()) {
			System.out.println("Valid password");
		} else {
			System.out.println("Input does not match phone, email, or password patterns");
		}

		sc.close();
	};

}
