package jasper.k.exercise;

import java.io.IOException;

public class FlowEx24 {
	public static void main(String[] args) throws IOException{
		int input = 0;
		 System.out.println("Input keywords.");
		 System.out.println("When you finish, input 'x' .");
		 do {
			 input = System.in.read();
			 System.out.println((char)input);
		 } while(input != -1 && input != 'x');
	}
}
