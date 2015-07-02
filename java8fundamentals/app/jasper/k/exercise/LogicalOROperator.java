package jasper.k.exercise;

public class LogicalOROperator {
	public static void main(String[] args) {
		int i = 10;	// primitive data type, initial, assign 10 to i
		int j = 15; // primitive data type, initial, assign 15 to j
		boolean b = (i > 5 | j > 10);	//primitive data type, initial, 10 > 5 | 15 > 10
		// true | true, true
		System.out.println("b= " + b);
	}
}