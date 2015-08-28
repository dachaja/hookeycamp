package anna.p.exercise.ch4;

public class FlowEx2 {
	public static void main(String[] args) {
		int visitCount = 5;
		if(visitCount < 1) {
			System.out.println("First visit. Thanks for coming.");
		} else {
			System.out.println("Thanks for coming again.");
		}
		System.out.println("Your visit count is " + ++visitCount + ".");
	}
}
