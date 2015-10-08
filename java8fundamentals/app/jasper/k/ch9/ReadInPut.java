package jasper.k.ch9;

import java.io.IOException;

public class ReadInPut {
	public static char readChar(){
		char c = '\u0000';
		int input;
		try {
			input = System.in.read();
			if(input != -1){
				c=(char)input;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
}
