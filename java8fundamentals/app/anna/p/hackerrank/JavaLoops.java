package anna.p.hackerrank;

import java.util.Scanner;

public class JavaLoops {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while(stdin.hasNextLine()) {
			String[] abn = stdin.nextLine().split(" ");
			if(abn.length == 3) {
				int a = Integer.parseInt(abn[0]);
				int b = Integer.parseInt(abn[1]);
				int n = Integer.parseInt(abn[2]);
				int result = a;
				for(int i=0; i <= n-1; i++) {
					result += (int) (Math.pow(2, i)*b);
					System.out.print(result + " ");
				}
				System.out.println("");
			}
			if(abn.length == 0) {
				System.out.println("End.");
				break;
			}
		}
	}
}
