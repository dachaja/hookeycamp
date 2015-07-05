package anna.p.exercise;

public class OperatorPrecedence {
	public static void main(String[] args) {
		int result;
		result = 10 + 8/2;
		System.out.println(result);
		result = 10 * 5/2;
		System.out.println(result);
		result = 10 * (5/2);
		System.out.println(result);
	}
}
