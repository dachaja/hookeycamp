package jasper.k.exercise;

public class IfElseEx2 {
	public static void main(String[] args) {
		int num1 = 49;
		int num2 = 10;
		int num3 = 30;
		
		if (num1 > 50) {
			// true.
//			num2 = num2 + 10;
//			num3 = num3 + 10;
			num2 += 10;
			num3 += 10;
			
		}	else {
			// false
//			num2 = num2 - 10;
//			num3 = num3 - 10;
			num2 -= 10;
			num3 -= 10;
		}
		System.out.println("num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3 );
	}
}
