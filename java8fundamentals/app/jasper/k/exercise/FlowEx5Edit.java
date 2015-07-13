package jasper.k.exercise;

public class FlowEx5Edit {
	public static void main(String[] args) {
		int score = 80;
		String grade = " ";
		System.out.println("Your score is " + score);
		grade = (score >= 90) ? "A" : 
			((score >= 98) ? (grade += "+") : 
				((score < 94) ? (grade += "-") : 
					((score >= 80 ) ? "B" : 
						((score >= 88) ? (grade += "+") : "C"))));
		System.out.println(grade);
	}
}
