package jasper.k.exercise;

import java.util.Scanner;

public class SwitchStatementEx1 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String name;
	    name = scan.next();
		switch (name) {
		case "Jasper":
			System.out.println("Jasper");
		case "Anna":
			System.out.println("Anna");
			break;
		default:
			System.out.println("No-match");
		}
	}
}
