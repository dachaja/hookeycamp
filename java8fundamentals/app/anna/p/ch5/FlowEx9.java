package anna.p.ch5;

public class FlowEx9 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 10) + 1;
		String msg = "";
		
		score *= 100;
		msg = "Your score is " + score + " and the price is ";
		
		switch(score) {
		case 1000 :
			msg += "bicycle, " ;
		case 900:
			msg += "TV, ";
		case 800:
			msg += "laptop, ";
		case 700:
			msg += "bicycle, ";
		default:
			msg += "ballpen";
		}
		System.out.println(msg + ".");
	}
}
