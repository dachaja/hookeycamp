package anna.p.exercise;

public class IfElseEx {
	public static void main(String[] args) {
		int num1 = 51; //primitive data, assign 49 to num1
		int num2 = 10; //primitive data, assign 10 to num2
		
	  //if (condition) {
		if (num1 > 50) {
			// true. num1 > 50
			num2 = num2 + 10;
		} else {
			// false. num1 < 50
			num2 = num2 - 10;
		}
		System.out.println("num1 = " + num1 + " num2 = " + num2);
	}
}