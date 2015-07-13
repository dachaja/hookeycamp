package jasper.k.exercise;

public class FlowEx11 {
	public static void main(String[] args) {
		int score = 88;
		char grade = ' ';
		
		switch(score/10) {
			case 10: case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
			default :
				grade = 'F';
 		}
		System.out.println("Your score is " + score + " also your grade is " + grade);
	}
}
