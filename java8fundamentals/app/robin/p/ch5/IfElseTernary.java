package robin.p.ch5;

public class IfElseTernary {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		if(num1 < num2)
			calc(num1);
		// system.out.println(num1)
		else
			calc(num2);
		
		num1 = 20;
		num2 = 10;
		calc(num1 > num2 ? num1 : num2);
		
	}

	public static void calc(int num) {
		// TODO Auto-generated method stub
		System.out.println(num);
	}
	
	
}
