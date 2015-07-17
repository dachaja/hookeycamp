package jasper.k.exercise;

public class IfElseTernary {
	public static void main(String[] args) {
		int num1 = 30;	// primitive data type, initial , assign 10 to num1
		int num2 = 20;	// primitive data type, initial, assign 20 to num2
		if (num1 < num2 )	// if 10 < 20 .True
			calc(num1);
		else
			calc(num2);
		num1 = 20;
		num2 = 10;
		calc(num1>num2 ? num1 : num2 ); // calc(num1) or calc(num2)
		
		int k = 15;
		System.out.println(k == 15 ? "k is 15" : "k is not 15");
		// System.out.println("k is 15"); or 
		// System.out.println("k is not 15");
	}
	private static void calc(int num) {
		System.out.println(num);
	}
}

