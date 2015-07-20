package anna.p.exercise;

public class FlowEx23 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		// i  : 0,1,2,3,4,5,6....
		//sum : 0,1,3,5,8,12,17,23...
		// sum + i : 2,5,9,
		while (sum + i <= 100) {
			sum += ++i;
			System.out.println(i + " - " + sum);
			System.out.println("sum + i = " + (sum + i));
		}
	}
}
