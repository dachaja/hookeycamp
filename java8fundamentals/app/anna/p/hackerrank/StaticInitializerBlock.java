package anna.p.hackerrank;

import java.util.Scanner;

public class StaticInitializerBlock {
	static	int B = 0;
	static	int H = 0;

	public static void main(String[] args) {
		Scanner STDIN = new Scanner(System.in);
        B = STDIN.nextInt();
        H = STDIN.nextInt();
        
        try {
			if(B <= 0  || H <= 0) {
    				throw new Exception();
			} else {
				System.out.println(B*H);
			}
		} catch(Exception e) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}
}
