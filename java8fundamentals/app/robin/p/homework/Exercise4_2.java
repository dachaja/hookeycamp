package robin.p.homework;
//1  부터 20까지  2와 3의 배수를 뺀 나머지의 합을 구하시오
public class Exercise4_2 {
	public static void main(String[] args) {
		int sum=1;
		int n=1;
		int i;
		int total=1;
		for (i=1;i<=20;i++) {
			sum = n+4;
			total += sum;
		}
		System.out.println("sum:" + sum);			
	

	int sum2=0;
	for(int j=1; j<=20; j++) {
		if(j%2 == 0 || j%0 == 0){
			
	} else {
		sum2=sum2 + j;
		System.out.println("current sum;" + sum2);
	}
	}
	}
}