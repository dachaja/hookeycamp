package elly.c.homework;

public class JavaExercise3_9 {
	public static void main(String[] args) {
		char ch = 'z';
		boolean b = ('a' <= ch && ch <= 'Z');
		
		System.out.println(b);
	}
}
// boolean b = ((ch >= 48 && ch <= 59) ? true :
//               (ch >= 65 && ch <= 90) ? true :
//               (ch >= 97 && ch <= 122) ? true : false);