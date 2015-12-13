package elly.c.homework;

public class JavaExercise3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (5/9f*(fahrenheit-32));
		float thirdDigits = (celcius * 100) % (int)(celcius * 100);
		celcius = celcius * 100;
		celcius = (float) (thirdDigits >= 0.5 ? (int)(celcius + 1) : (int)celcius);
		celcius = celcius / 100;
		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}
	
}
