package anna.p.exercise.ch4;

public class Exercise4_15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		while(tmp != 0) {
			result = (result * 10) + (tmp % 10);
			tmp = tmp / 10;
		}
		
		if(number == result) {
			System.out.println(number + "is palindrome.");
		} else {
			System.out.println(number + "is not palindrome.");
		}
	}
}
