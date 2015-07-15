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
		
		char ch1 = (char)((Math.random() * 10) + 1);
		char ch2 = (char)((Math.random() * 10) + 1);
		char ch3 = (char)((Math.random() * 10) + 1);
		char ch4 = (char)((Math.random() * 10) + 1);
		char ch5 = (char)((Math.random() * 10) + 1);
		//int value = (int)c.charValue();
		String str = (int)ch1 + ""+ (int)ch2 + "" + (int)ch3 + "" + (int)ch4 + "" + (int)ch5;
		System.out.println(str);
 		
	}
}
