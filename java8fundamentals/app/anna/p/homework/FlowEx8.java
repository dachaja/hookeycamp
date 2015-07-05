package anna.p.homework;

public class FlowEx8 {
	public static void main(String[] args) {
		int score = 1;
		
		switch (score*100) {
			case 100 : 
				System.out.println("Your score is 100 and the price is a bicycle.");
			case 200 : 
				System.out.println("Your score is 200 and the price is a TV.");
			case 300 : 
				System.out.println("Your score is 300 and the price is a laptop.");
			case 400 : 
				System.out.println("Your score is 400 and the price is a car.");
			default : 
				System.out.println("Play again.");
		}
	}
}
