package jasper.k.exercise;

public class ShortCircuit {
	public static void main(String[] args) {
		int i = 10; // primitive data type, assign 10 to i. initial
		int j = 15; // primitive data type, assign 15 to j. initial
		boolean b = (i < 5 || j > 10); // primitive data type, initial
		System.out.println("b=" + b);
		System.out.println("b=" + b + " " + i + " " + j + " " + (i+j));
		b = (i > 20 || j > 10);
		System.out.println("b=" + b);
		System.out.println("b=" + b + " " + i + " " + j + " " + (i+j));
	}
}
