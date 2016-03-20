package elly.c.homework;

public class JavaExrcise4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		for(num = 12345; num > 0; num /= 10)
		sum += num%10;
		
		System.out.println("sum="+sum);
		
	}
}
