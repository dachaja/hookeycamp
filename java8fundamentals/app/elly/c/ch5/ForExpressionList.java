package elly.c.ch5;

public class ForExpressionList {
	public static void main(String[] args) {
		// Outer for-loop statement
		for(int i = 1; i <= 3; i++) {
			//inner for-loop statement
			for(int j = 1; j <= 3; j++) {
				System.out.print(i + " " + j);
				// Prints a tab after each column value
				System.out.print("\t");
			}
			System.out.println(); // Prints a new line
		}
	}

}
