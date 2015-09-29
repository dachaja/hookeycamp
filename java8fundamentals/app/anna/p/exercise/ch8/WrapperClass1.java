package anna.p.exercise.ch8;

public class WrapperClass1 {
	public static void main(String[] args) {
		// Creates an Integer object from an int
		Integer intObj1 = new Integer(100);
		
		// Creates an Integer object from a String
		Integer intObj2 = new Integer("1969");
		
		// Creates a Double object from a double
		Double doubleObj1 = new Double(10.45);
		
		// Creates a Double object from a String
		Double doubleObj2 = new Double("234.60");
		
		// Creates a Character object from a char
		Character charObj1 = new Character('A');
		
		// Creates a Boolean object from a boolean
		Boolean booleanObj1 = new Boolean(true);
		
		// Creates Boolean objects from Strings
		Boolean booleanTrue = new Boolean("true");
		Boolean booleanFalse = new Boolean("false");
		
		Integer intObj3 = Integer.valueOf(100);
		Integer intObj4 = Integer.valueOf("1969");
		Double doubleObj3 = Double.valueOf(10.45);
		Double doubleObj4 = Double.valueOf("234.60");
		Character charObj2 = Character.valueOf('A');
	}
}
