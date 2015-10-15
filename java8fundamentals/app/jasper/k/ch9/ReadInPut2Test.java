package jasper.k.ch9;

import java.io.IOException;

public class ReadInPut2Test {
	public static void main(String[] args) {
		System.out.println("Enter some text and then pressEnter key:");
		char c;
		try {
			c = ReadInPut.readChar();
			System.out.println("The first character you entered is : " + c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
