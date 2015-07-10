package anna.p.exercise;

// Exercise CheckOddEven (if-else): 
// Write a program called CheckOddEven which prints "Odd Number" 
// if the int variable “number” is odd, or “Even Number” otherwise.
// String result = ((number % 2 == 0) ? "Even Number" : "Odd Number");

public class CheckOddEven {
	public static void main(String[] args) {
		int number = 49;
		String result;
		
		if(number % 2 == 0) {
			result = "Even Number";
		} else {
			result = "Odd Number";
		}
		System.out.println(result);
	}
}
