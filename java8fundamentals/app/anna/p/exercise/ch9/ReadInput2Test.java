package anna.p.exercise.ch9;

import java.io.IOException;

public class ReadInput2Test {
	public static void main(String[] args) {
		System.out.println("Enter some text and then press Enter key: ");
		char c = ReadInput.readChar();
		System.out.println("The first character you entered is: " + c);
	}
}
