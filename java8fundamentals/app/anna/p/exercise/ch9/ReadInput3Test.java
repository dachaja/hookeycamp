package anna.p.exercise.ch9;

import java.io.IOException;

public class ReadInput3Test {
	public static void main(String[] args) {
		System.out.println("Enter some text and then press Enter key: ");
		char c = ReadInput.readChar();
		System.out.println("The first character you entered is: " + c);
		
		try {
			Test test = new Test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
