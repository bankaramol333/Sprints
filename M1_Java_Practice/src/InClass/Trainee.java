package InClass;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;

public class Trainee {
	int age;
	String name;
	String city;

	void DisplayInfo() {
		System.out.println("Trainee Name is " + name);
		System.out.println("Trainee age is " + age);
		System.out.println("Trainee city is " + city);
	}

	void EligiVoting() {
		if (age > 18) {
			System.out.println(name + " is Eligible For Voting");
		} else
			System.out.println(name + " is Not Eligible For Voting");
	}

	public static void main(String[] args) {
		Trainee t1 = new Trainee();
		Trainee t2 = new Trainee();

		t1.name = "omkar";
		t1.city = "Latur";
		t1.age = 22;

		t2.name = "Amol";
		t2.city = "Akola";
		t2.age = 15;
		t1.DisplayInfo();
		t2.DisplayInfo();
		t1.EligiVoting();
		t2.EligiVoting();

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "Amol");
		hm.put(2, "Anish");
		System.out.println(hm.get(1));
		for (HashMap.Entry<Integer, String> e : hm.entrySet()) {
			System.out.println(e.getValue() + " " + e.getKey());
		}

		LocalTime Start = LocalTime.now();
		LocalTime vt = LocalTime.of(10, 0);
		System.out.println(Start);
		System.out.println(vt);
		Duration d = Duration.between(Start, vt);
		System.out.println(d);

	}
}
