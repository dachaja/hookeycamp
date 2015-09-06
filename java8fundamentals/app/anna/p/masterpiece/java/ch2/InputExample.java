package anna.p.masterpiece.java.ch2;

import java.io.InputStreamReader;

public class InputExample {
	public static void main(String[] args) {
		InputStreamReader rd = new InputStreamReader(System.in);
		try {
			while(true) {
				int a = rd.read();
				if(a == '0')
					break;
				System.out.println((char)a);
			}
		} catch (Exception e) {
			System.out.println("Input error exception.");
		}
	}
}
