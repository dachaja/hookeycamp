package anna.p.ch5;

public class FlowEx12 {
	public static void main(String[] args) {
		int sum = 0;
		
		//   step1 -> step2 -> step 5
		for(int i=1; i <= 10; i++) {
			// step 3
			sum += 1; // sum = sum + 1;
			
			// step 4
			System.out.println("sum : " + sum);
		}
	}
}
