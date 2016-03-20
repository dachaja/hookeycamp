package elly.c.homework;

// 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
public class JavaExercise4_4 {
	public static void main(String[] args) {
		int i = 1;
		int j = -2;
		int sum = -1;
		
		for (i = 1, j = -2; true; i = i +2, j = j -2 ){
				sum += i+j;
				
				if(sum >= 100){
				System.out.println(sum);
				break;
				}
			}
		
		//
		int sum2 = 0;
		for (int k = 1; true; k++) {
			if(k % 2 == 0) {
				sum2 = sum2 - k;
			} else {
				sum2 = sum2 + k;
			}
			System.out.println("current k is " + k + ", current sum is " + sum2);
			if(sum2 >= 100) {
				System.out.println("k's value is " + k);
				break;
			}
		}
		
		}
}

