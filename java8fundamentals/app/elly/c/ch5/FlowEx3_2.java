package elly.c.ch5;

public class FlowEx3_2 {
	public static void main(String[] args) {
		int score = 99;
		String grade = "";
		
		if(score <= 100 && score >= 98) {
			grade = "+A";
		} else if(score <= 97 && score >= 94) {
			grade = "A";
		} else if(score <= 93 && score >= 90) {
			grade = "-A";
		} else if(score <= 89 && score >= 88) {
			grade = "+B";
		} else if(score <= 87 && score >= 84) {
			grade = "B";
		} else if(score <= 83 && score >= 80) {
			grade = "-B";
		} else {
			grade = "c";
		}
	}
}
