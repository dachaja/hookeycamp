package jasper.k.exercise; // package name , which package has this class.

public class CompoundBooleanLogicalAssignmentOpperator {	// class' name
	public static void main(String[] args) { // main method 
		boolean b = true ; // primitive data type, initial, assign true to b
		b &= true; // 
		System.out.println(b);
		// true & true = true
		b &= false ;
		System.out.println(b);
		// true & false = false
		b |= true;
		System.out.println(b);
		// true |= true = true
		b |= false;
		System.out.println(b);
		// true |+ false = true
		b ^= true;
		System.out.println(b);
		// true ^= true = false
		b ^= false;
		System.out.println(b);
		// true ^= false + false
	}
}
