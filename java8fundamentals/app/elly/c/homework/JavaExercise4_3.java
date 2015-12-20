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
	}
}

// int a = (a >= 1 && a <= 10); a++;
// int b = (b <= 10 && b >= 1); b--;
// int total = 