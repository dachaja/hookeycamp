package anna.p.ch5;

public class FlowEx3_2 {
	public static void main(String[] args) {
		int score = 99;
		String grade = "";
		
		if(score <= 100 && score >= 98) {
			grade = "+A";
		} else if(score <= 97 && score >= 94) {
			grade = "A";
		}
	}
}
