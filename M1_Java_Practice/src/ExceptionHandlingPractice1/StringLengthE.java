package ExceptionHandlingPractice1;

class NullStringException extends Exception {
	public NullStringException(String msg) {
		super(msg);
	}
}

public class StringLengthE {
	public static int checkLen(String str) throws NullStringException {
		if (str.length() == 0) {
			throw new NullStringException("String is null");
		} else {
			return str.length();
		}
	}

	public static void main(String[] args) throws NullStringException {
		try {
			String s = "Amol";
			String s2 = "";

			System.out.println(checkLen(s));
			System.out.println(checkLen(s2));
			System.out.println(s2);
		} catch (NullStringException e) {
			System.out.println(e.getMessage());
		}
	}
}
