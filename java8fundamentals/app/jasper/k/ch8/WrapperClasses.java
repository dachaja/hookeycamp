package jasper.k.ch8;

public class WrapperClasses {
	public static void main(String[] args) {
		Integer intobj1 = new Integer(100);
		// Create an integer object from an int
		
		Integer intObj2 = new Integer("1969");
		// Create an Integer object from a String
		
		Double doubleObj1 = new Double(10.45);
		// Create a Double object from Double
		
		Double doubleObj2 = new Double("234.60");
		// Create a Double object from String
		
		Character charObj1 = new Character('a');
		// Create a Character object from char
	
		Boolean booleanObj1 = new Boolean(true);
		// Create a Boolean object from boolean
		
		boolean booleanTrue = new Boolean("true");
		boolean BooleanFalse = new Boolean("false");
		// CreateBoolean objects from Strings
		
		Integer intobj3 = Integer.valueOf(100);
		Integer intobj4 = Integer.valueOf("1969");
		Double doubleObj3 = Double.valueOf(10.45);
		Double doubleObj4 = Double.valueOf("234.60");
		Character charObj2 = Character.valueOf('a');
		
		
	}
}
