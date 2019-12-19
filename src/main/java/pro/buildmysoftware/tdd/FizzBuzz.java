package pro.buildmysoftware.tdd;

public class FizzBuzz {

	public static void msg() {
	}

	public static String msg(int number) {
		if (number == 0) {
			throw new IllegalArgumentException("0 is not allowed");
		}
		if (number % 15 == 0) {
			return "fizzbuzz";
		}
		if (number % 5 == 0) {
			return "buzz";
		}
		if (number % 3 == 0) {
			return "fizz";
		}
		return String.valueOf(number);
	}
}
