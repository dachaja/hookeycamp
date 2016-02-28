package elly.c.ch5;

public class FlowEx19 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i=1; i < 1000000000; i++) {
			;
		}
		long endTime = System.currentTimeMillis();
		
		System.out.println("Start time : " + startTime);
		System.out.println("End time : " + endTime);
		System.out.println("Elapsed time : " + (endTime - startTime));
	}
}
