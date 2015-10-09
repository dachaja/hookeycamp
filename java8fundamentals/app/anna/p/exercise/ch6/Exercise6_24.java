package anna.p.exercise.ch6;

public class Exercise6_24 {
	public static int abs(int value) {
		return Math.abs(value);
	}
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "'s abs: " + abs(value));
		value = -10;
		System.out.println(value + "'s abs: " + abs(value));
	}
}
