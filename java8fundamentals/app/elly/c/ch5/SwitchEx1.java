package elly.c.ch5;

public class SwitchEx1 {
	public static void main(String[] args) {
		int i = 10;
		switch(i) {
		case 10:
			System.out.println("Ten");
			break;
		case 20:
			System.out.println("Twenty");
			break;
		default:
			System.out.println("No-match");
			break;
		}
	}
}
