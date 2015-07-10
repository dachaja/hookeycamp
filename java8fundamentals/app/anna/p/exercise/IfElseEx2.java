package anna.p.exercise;

public class IfElseEx2 {
	public static void main(String[] args) {
		int num1 = 55;
		int num2 = 10;
		int num3 = 30;
		
		if(num1 > 50) {
			// True.
			//num2 = num2 + 10;
			//num3 = num3 + 10;
			
			num2 += 10;
			num3 += 10;
			
		} else {
			// False.
			//num2 = num2 - 10;
			//num3 = num3 - 10;
			
			num2 -= 10;
			num3 -= 10;
		}
		System.out.println("num1, num2, num3 " +
		num1 +", " + num2 + ", " + num3);
	}
}