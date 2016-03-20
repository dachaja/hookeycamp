package anna.p.ch5;

public class FlowEx23 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(sum + i <= 100) {
			//sum += ++i;
			sum = sum + ++i;
			// 1 = 0 + 1;
			// 3 = 1 + 2
			// 6  = 3 + 3
			// 10 = 6 + 4
			System.out.println(i + " - " + sum);
		}
	}
}
