package anna.p.ch5;

public class FlowEx1 {
	public static void main(String[] args) {
		int visitCount = 0;
		if(visitCount < 1) {
			System.out.println("First visit.");
		} else {
			System.out.println("Thanks for coming again.");
		}
		System.out.println("Visit Count is " + ++visitCount);
		
		// ++visitCount;
		// visitCount = visitCount + 1;
		// System.out.println("Visit Count is " + visitCount);
		
		//visitCount++;
		// System.out.println("Visit Count is " + visitCount);
		// visitCount = visitCount + 1;
	}
}
