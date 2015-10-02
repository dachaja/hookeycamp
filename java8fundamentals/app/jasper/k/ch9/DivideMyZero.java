package jasper.k.ch9;

public class DivideMyZero {	
	public static void main(String[] args) {
		try{
			int x = 10, y = 0, z;
			z= x/y;
			System.out.println("z= "+z);
		} catch (ArithmeticException e){
			// Get the description of the exception
			String msg = e.getMessage();
			
			// Print a custom error message
			System.out.println("An error has occured. The error is:" + msg);
		}
		
		System.out.println("At the end of the program.");
	}
}
