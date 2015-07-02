package anna.p.homework;

public class FlowEx5 {
	public static void main(String[] args) {
	    int score = 82;
	    String grade = "";
	    System.out.println("Your score is " + score);
	    if (score >= 90) {
	    grade = "A";
	    if (score >= 98) {
	    grade += "+";
	} else if(score < 94) {
	    grade += "-";
	}
	} else if(score >= 80) {
	    grade = "B";
	    if(score >= 88) {
	    grade += "+";
	} else if(score < 84) {
	    grade += "-";
	}
	} else {
	    grade = "C";
	}
	System.out.println("Your grade is " + grade);
	}
}
