package anna.p.exercise;

public class AndOperator {
	public static void main(String[] args) {
		int i = 10; // primitive data type, initial i variable.
		int j = 15; // primitive data type, initial j variable.
		boolean b;	// primitive data type, Declaration.
		b = (i > 5 & j > 10); // 10 > 5 & 15 > 10, True & True, True
		System.out.println("b= " + b + ",i= " + i + ",j= " + j); // True, 10, 15
		b = (i> 25 & ((j = 20) > 15)); // 10 > 25 & (20 > 15), False & True, False
		System.out.println("b= " + b + ",i= " + i + ",j= " + j); // False, 10, 20
	}
}