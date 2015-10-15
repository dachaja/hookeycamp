package anna.p.exercise.ch9;

import java.io.IOException;
import java.util.Scanner;

public class Test {
	static {
		try {
			char c = (char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	{
		char c = (char) System.in.read();
	}
	
	public Test() throws IOException{
		
	}
	
	public Test(int a) throws IOException{
		
	}
}
