package anna.p.exercise.ch9;

import java.io.IOException;

public class ReadInput {
	public static char readChar() {
		char c = '\u0000';
		//int input;
		try {
			int input = System.in.read();
			if(input != -1) {
				c = (char)input;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}
}
