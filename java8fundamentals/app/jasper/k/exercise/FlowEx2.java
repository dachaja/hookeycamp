package jasper.k.exercise;

public class FlowEx2 {
	public static void main(String[] args) {
		int visitCount = 5;			// primitive data type, initial, assign 5 to visitCount
		if (visitCount < 1 ) {		// 5 < 1  . False
			System.out.println("First visit.");
		} else {
			System.out.println("Thanks for coming again.");
	
		}
		System.out.println("Visit Count is " + ++visitCount);
	}
}
