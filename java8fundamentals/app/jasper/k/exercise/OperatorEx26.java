package jasper.k.exercise;

public class OperatorEx26 {
	public static void main(String[] args) {
		int x = 3;	// primitive data type, initial , assign 3 to x
		int y = 5;	// primitive data type, initial , assign 5 to y
		System.out.println("x is " + x + " and, y is " + y);	// x is 3 and, y is 5
		System.out.println("x | y = " + (x|y));					// x | y = 
		System.out.println("x & y = " + (x&y));
		System.out.println("x ^ y= " + (x^y));
		
		System.out.println("true | false = " + (true|false));	// true | false + true
		System.out.println("true & false = " + (true&false));	// true & false + false
		System.out.println("true ^ false = " + (true^false));	// true ^ false = true
	}
}
