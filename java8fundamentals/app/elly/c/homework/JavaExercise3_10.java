package elly.c.homework;

public class JavaExercise3_10 {
	public static void main(String[] args) {
		char ch = 'A';
		
		char lowerCase = ('A' <= ch )? (char) (ch + 32) : ch;
		
		System.out.println("upperCase:" + ch);
		System.out.println("lowerCase:" + lowerCase);
	}
}
// char lowerCase = (char) (ch <= 90 && ch >= 65)? (ch +32) : ch;