package jasper.k.ch9;

import java.io.IOException;

public class ReadInPut {
	public static char readChar() throws IOException{
		char c = '\u0000';
		int input;
			input = System.in.read();
			if(input != -1){
				c=(char)input;
	
			}
			return c;
	}
}
