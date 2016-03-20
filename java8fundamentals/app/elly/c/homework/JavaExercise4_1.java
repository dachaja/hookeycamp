package elly.c.homework;

public class JavaExercise4_1 {
	public static void main(String[] args) {
		char ch = 'a';
		if (ch <= 90 && ch >= 65 || ch <= 122 && ch >= 97) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		int year = 2016;
		boolean answer = (year % 400 == 0 || year % 4 == 0 && year % 100 > 0)? true : false;
	
		boolean powerOn = false;
		if(!powerOn)
			powerOn = true;
		
		String str = "yes";
		if(str == "yes") {
			System.out.println("true");
		}
		
//		str answer1 = "yes";        
				
		
		System.out.println("6. " + answer);
		System.out.println("7. " + powerOn);
//		System.out.println("8. " + answer1);
}
}
