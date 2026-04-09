package InClass;

public class StaticMethodDemo {
	static int add(int a, int b) {
		return a + b;
	}

	static void showMessage() {

		System.out.println("This is Static method");
		System.out.println("Static variable value: " + staticVariable);
	}

	static int staticVariable = 100;
	static int count = 2;
	int x = 10;
//	static int num1=30;

	static {
		count++;
		System.out.println(count);
		System.out.println("Static Block Execuetd.Static Variable: " + staticVariable);
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int sum = add(num1, num2);
		System.out.println("Sum: " + sum);
		showMessage();
		StaticMethodDemo obj = new StaticMethodDemo();
		System.out.println("Accesing instances variable x using object " + obj.x);
	}
}
