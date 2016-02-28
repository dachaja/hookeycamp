package elly.c.homework;

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
		}
	
}

