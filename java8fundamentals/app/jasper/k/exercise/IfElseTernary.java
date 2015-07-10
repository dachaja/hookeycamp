package jasper.k.exercise;

public class IfElseTernary {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		if (num1 < num2 )
			calc(num1);
		else
		num2 = 10;
		calc(num1>num2 ? num1 : num2 );
	}
	private static void calc(int num) {
		System.out.println(num);
	}
}


