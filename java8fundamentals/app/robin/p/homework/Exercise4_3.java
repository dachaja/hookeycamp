package robin.p.homework;
//1+(1+2)+(1+2+3).....(1+..10) 의 계산
public class Exercise4_3 {
	public static void main(String[] args) {
		int sum = 0;
		int totalSum=0;
		int i;
		for (i=1; i<=10; i++) {
			sum = sum+i;
			totalSum += sum;
			
			System.out.println("sum = " + sum);
			
		}
		System.out.println("Total = "+ totalSum);
		
		
		int sum2 = 0;
		int totalsum2 = 0;
		for (int j = 1; j <= 10; j++) {
			sum2 = sum2 + j;
			totalsum2 += sum2;
		}
	}
}
