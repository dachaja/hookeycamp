package jasper.k.exercise;

public class AndOperator {
	public static void main(String[] args) {
		int i = 10;	// primitive data type, initial i variable.
		int j = 15;	// primitive data type, initial j variable.
		boolean b;	// primitive data type, Declaration.
		b = (i > 5 & j > 10);	// 10 > 5 & 15 > 10 ,True & True , True
		System.out.println("b= " + b + ",i=" + i + ",j= " + j);
		b = (i > 25 & ((j = 20) > 15));
		System.out.println("b= " + b + ",i=" + i + ",j= " + j);
	}
}
