package anna.p.ch4;

public class BlockStatement {
	public static void main(String[] args) {
		int num1;
		int num2;
		{
			num2 = 200;
			num1 = 100;
		}
		int num3 = 50;
		
		if(num1 > 50)
			num2 = num2 + 10;
		else
			num2 = num2 - 10;
		
		// switch ;star
		int i = 10;
		switch(i) {
			case 10:
				System.out.println("Ten");
				break;
			case 20:
				System.out.println("Twenty");
				break;
			default:
				System.out.println("No-match");
				break;
		}
		
		for(int num = 1; num <= 10; num++)
			System.out.println(num);
		
	}
}
