package anna.p.ch5;

public class SwitchEx2 {
	public static void main(String[] args) {
		int age = 20;
		
		switch(age) {
		case 10:
			System.out.println("Ten");
			break;
		case 20:
			System.out.println("Twenty");
			default:
				System.out.println("No-match");
		}
		
		String process = "Wakeup";
		
		switch(process) {
		case "Wakeup":
			System.out.println("Step 1");
		case "Shower":
			System.out.println("Step 2");
			break;
		case "Breakfast":
			System.out.println("Step 3");
			break;
		}
		
		byte b = 10;
		switch(b) {
		case 5:
			b++;
		case (byte) 150:
			b--;
			default:
				b = 0;
		}
		
		int num = 10;
		switch(num) {
		case 10:
			num++;
		case 20:
			num--;
			default:
				num = 100;
		}
		
		int num1 = 10;
		int num2 = 10;
		switch(num1) {
		case 20:
			System.out.println("num1 is 20");
		case 10:
			System.out.println("num1 is 10");
		}
		
		// Using an if-else statement
		int i = 10;
		if(i==10) {
			System.out.println("i is 10");
		}else if(i==20) {
			System.out.println("i is 20");
		}else{
			System.out.println("i is neither 10 nor 20");
		}
		
		// Using an switch statement
		
	}
}
