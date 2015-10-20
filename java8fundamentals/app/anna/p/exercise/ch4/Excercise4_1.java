package anna.p.exercise.ch4;

public class Excercise4_1 {
	public static void main(String[] args) {
		System.out.println(Ex411.greaterThan10AndLessThan20(10));
		System.out.println(Ex412.isNotBlankOrTab(' '));
		System.out.println(Ex413.isxOrX('x'));
		System.out.println(isNumber('8'));
	}
	
	private static boolean isNumber(char ch) {
		if(Character.isDigit(ch)) return true;
		return false;
	}
}

class Ex411 {
	protected static boolean greaterThan10AndLessThan20(int x) {
		if(x > 10 && x < 20) {
			return true;
		}
		return false;
	}
}

class Ex412 {
	protected static boolean isNotBlankOrTab(char ch) {
		if(ch == ' ' || ch == '\t') return false;
		return true;
	}
}

class Ex413 {
	protected static boolean isxOrX(char ch) {
		if(ch == 'x' || ch == 'X') return true;
		return false;
	}
}