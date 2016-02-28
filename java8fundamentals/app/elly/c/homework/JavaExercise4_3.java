package elly.c.homework;

public class JavaExercise4_3 {
	public static void main(String[] args) {
		
		int a = 1;
		int b = a + 1;
		int c = b + 1;
		int d = c + 1;
		int e = d + 1;
		int f = e + 1;
		int g = f + 1;
		int h = g + 1;
		int i = h + 1;
		int j = i + 1;
		
		int sum = (((a * j) + (b * i) + (c * h) + (d * g) + (e * f)) * 2);
		
		System.out.println("sum = " + sum);
		
		// Exercise 4-2
		sum = 0;
		if(a % 2 == 0 || a % 3 == 0) {
			
		} else {
			sum = sum + a;
		}
		if(b % 2 == 0 || b % 3 == 0) {
			
		} else {
			sum = sum + b;
		}
		if(c % 2 == 0 || c % 3 == 0) {
			
		} else {
			sum = sum + c;
		}	
	}
}

// int a = (a >= 1 && a <= 10); a++;
// int b = (b <= 10 && b >= 1); b--;
// int total = 