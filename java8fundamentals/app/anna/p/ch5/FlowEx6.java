package anna.p.ch5;

public class FlowEx6 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 10) + 1;
		
		switch(score*100) {
		case 100 :
			System.out.println("Your score is 100 and the price is a bicycle.");
			break;
		case 200 :
			System.out.println("Your score is 200 and the price is a TV.");
			break;
		case 300 :
			System.out.println("Your score is 300 and the price is a laptop.");
			break;
		case 400 :
			System.out.println("Your score is 400 and the price is a car.");
			break;
		default :
			System.out.println("Play again.");
			break;
		}
	}
}
