package elly.c.ch5;

public class FlowEx3 {
	public static void main(String[] args) {
		int score = 45;
		String grade = " ";
		if(score >= 90) {
			grade = "A";
			if(score >= 98) {
				grade += "+";
			} else if(score < 94) {
				grade += "-";
			}
		}else if(score >=80) {
			grade = "B";	
			if(score >= 88) {
				grade += "+";
			} else if(score < 84) {
				grade += "-";
			}
		}else {
			grade = "c";
		}
		
		// grade =(score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		
		System.out.println("Your grade is " + grade);
	}
}
