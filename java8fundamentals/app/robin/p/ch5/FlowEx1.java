package robin.p.ch5;

public class FlowEx1 {

	public static void main(String[] args) {
		int visitCount = 5;
		if(visitCount < 1 ) {
			System.out.println("First visit");
		} else {
			System.out.println("Thanks for coming again.");
		}
		System.out.println("Visit Count is" + ++visitCount);
		// visitcount = visitcount + 1;
		//
	}
}
