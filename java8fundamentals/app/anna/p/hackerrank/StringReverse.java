package anna.p.hackerrank;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		if(A==null) {
			System.out.println("No");
			return;
		}
		int n = A.length();
		for (int i = 0; i < (n/2); i++) {
			if(A.charAt(i) != A.charAt(n-1-i)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
