package anna.p.ch5;

public class FlowEx14 {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for(i=1; i < 10; i++) {
			sum += i; // sum = sum + i
//			0 = 0 + 1 1
//		    3 = 1 + 2 3
//		    6 = 3 + 3 5
//		    10 = 6 + 4 7
//		    15 = 10 + 5 9
//		    21 = 15 + 6 11
//		    28 = 21 + 7 13
//		    36 = 28 + 8
//			45 = 36 + 9
			
		}
		System.out.println(i-1 + "'s sum = " + sum);
	}
}
