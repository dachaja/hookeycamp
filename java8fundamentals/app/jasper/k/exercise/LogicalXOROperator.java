package jasper.k.exercise;

public class LogicalXOROperator {
	public static void main(String[] args) {
		int i= 10;	// primitive data type, initial , assign 10 to i.
		boolean b;	// primitive data type, delcaration.
		b = true^true; 		// Assigns false to b
		System.out.println(b);
		b = true^false;		// assigns true to b
		System.out.println(b);
		b = false^true;		// Assigns true to b
		System.out.println(b);
		b = false^false;	// Assigns false to b
		System.out.println(b);
	}
}
