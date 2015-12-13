package anna.p.ch5;

public class IfElseTernary {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		if(num1 < num2)
			printOut(num1);
			//System.out.println(num1);
		else
			printOut(num2);
			//System.out.println(num2);
		
		num1 = 20;
		num2 = 10;
		printOut(num1 > num2 ? num1 : num2);
		//calc(num1 > num2 ? System.out.println(num1) : System.out.println(num2));
	}

	public static void printOut(int num) {
		System.out.println(num);
	}
	
	public static void writeToFile(int num) {
	}
	
	private void run() { }
	private void walk() { }
	private void bark() { }
}
