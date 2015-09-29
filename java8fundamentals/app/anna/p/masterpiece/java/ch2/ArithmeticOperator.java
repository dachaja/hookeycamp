package anna.p.masterpiece.java.ch2;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		int time;
		int second;
		int minute;
		int hour;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Integer");
		
		time = sc.nextInt();
		second = time % 60;
		minute = (time / 60) % 60;
		hour = (time / 60) / 60;
		System.out.print(time + " seconds are ");
		System.out.print(hour + " hour ");
		System.out.print(minute + " minute ");
		System.out.print(second + " second.");
	}
}
