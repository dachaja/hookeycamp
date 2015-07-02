package anna.p.exercise;

public class OrOperator {
	public static void main(String[] args) {
		int i = 10; // primitive data type, assign 10 to i. initial
		int j = 15; // primitive data type, assign 15 to j, initial
		boolean b = (i > 5 || j > 10); // primitive data type, 
		// initial, 10 > 5 || 15 > 10, true || true , true
		System.out.println(b); // true
		System.out.println("b= : + $ %" + b + " " + i + " " + j + " " + (i*j));
		b = (i > 20 || j > 10); // 10 > 20 || 15 > 10, false || true, true
		System.out.println(b); //true
	}
}
