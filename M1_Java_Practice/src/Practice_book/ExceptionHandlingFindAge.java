package Practice_book;

class Age {
	String drink;
	String vote;
	String movie;
}

class ExceptionCheck {
	public String drinkingCheck(Age a, int age) throws IllegalAgeException {
		if (age < 21) {
			a.drink = "illegal";
			throw new IllegalAgeException("Illegal drinking age");
		} else {
			a.drink = "legal";
		}

		return a.drink;
	}

	public String votingCheck(Age a, int age) throws IllegalAgeException {
		if (age < 18) {
			a.vote = "illegal";
			throw new IllegalAgeException("can't vote");
		} else {
			a.vote = "legal";
		}
		return a.vote;
	}

	public String movieCheck(Age a, int age) throws IllegalAgeException {
		if (age < 14) {
			a.movie = "illegal";
			throw new IllegalAgeException("can't watch movie");
		} else {
			a.movie = "legal";
		}
		return a.movie;
	}
}

class IllegalAgeException extends Exception {
	public IllegalAgeException(String msg) {
		super(msg);
	}
}

public class ExceptionHandlingFindAge {
	public static void main(String[] args) {
		Age age = new Age();
		ExceptionCheck ec = new ExceptionCheck();
		try {
			System.out.println("drinkiing is " + ec.drinkingCheck(age, 21));

		} catch (IllegalAgeException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("voting is " + ec.votingCheck(age, 17));

		} catch (IllegalAgeException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println("watching movie is " + ec.movieCheck(age, 18));

		} catch (IllegalAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
