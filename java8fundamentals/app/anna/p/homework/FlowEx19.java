package anna.p.homework;

public class FlowEx19 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) {
			;
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("Start Time : " + startTime);
		System.out.println("End Time : " + endTime);
		System.out.println("Elapsed Time : " + (endTime - startTime));
	}
}
