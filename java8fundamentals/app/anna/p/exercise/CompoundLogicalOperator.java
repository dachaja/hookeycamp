package anna.p.exercise;

public class CompoundLogicalOperator {
	public static void main(String[] args) {
		boolean b = true;	// primitive type, initial, assign true to b
		b &= true; // b = b & true; true & true, true
		System.out.println(b);
		b &= false; // b = b & false, true & false, false
		System.out.println(b);
		b = false; // assign false to b.
		b |= true; // b = b | true, false | true, true 
		System.out.println(b);
		b |= false; // b = b | false, true
		System.out.println(b);
		b = true; // assign true to b
		b ^= true; // b = b ^ true, true ^ true, false
		System.out.println(b);
		b ^= false; // b = b ^ false, false ^ false, false.
		System.out.println(b);
	}
}
