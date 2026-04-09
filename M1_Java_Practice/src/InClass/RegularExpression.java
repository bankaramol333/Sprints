package InClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		String emailpattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
		Pattern pattern = Pattern.compile(emailpattern);
		String email = "Omkar@gmail.com";
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			System.out.println("Email Is Valid.");
		} else {
			System.out.println("Email is Invalid");
		}
	}

}
