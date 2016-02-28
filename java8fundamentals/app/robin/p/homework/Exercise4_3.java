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
			
			
			
		}
		System.out.println("Total = "+ totalSum);
	}

}
