package anna.p.hackerrank;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int count = 1;
		while(stdin.hasNext()) {
			System.out.println(count + " " + stdin.nextLine());
			count++;
		}
	}
}
