package anna.p.exercise;

public class Test {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int num1 = i, num2 = i;
			System.out.println("num1++ " + num1++);
			System.out.println("++num2 " + ++num2);
			
			num1 = num2 = 25;
			System.out.println("num1 num2 " + num1 + num2);
		}
		
		byte b1;
		byte b2=2;
		byte b3=3;
		
		//b1=127+10;
	}

}
