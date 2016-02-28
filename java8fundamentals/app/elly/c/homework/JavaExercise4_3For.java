package elly.c.homework;

public class JavaExercise4_3For {
	public static void main(String[] args) {
		int sum = 0;
		int totalSum = 0;
		
		for (int i = 1; i <= 10; i++){
			sum = sum + i;
			totalSum += sum;
			
			if (i == 10){
			System.out.println("Total Sum : " + totalSum);
			}
		}
	}

}
