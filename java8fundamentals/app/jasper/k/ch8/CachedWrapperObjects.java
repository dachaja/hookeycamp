package jasper.k.ch8;

public class CachedWrapperObjects {
	public static void main(String[] args) {
		System.out.println("Using the constructor: ");
		
		Integer iv1 = new Integer(25);
		Integer iv2 = new Integer(25);
		System.out.println("iv1 = " + iv1+ ", iv2 =" + iv2);
		
		System.out.println("iv1 == iv2: " + ( iv1 == iv2));
		
		System.out.println("iv.equals(iv2):" + iv1.equals(iv2));
		
		System.out.println("\nUsing the valueOf ()Method:");
		
		Integer iv3 = Integer.valueOf(25);
		Integer iv4 = Integer.valueOf(25);
		System.out.println("iv3 = " + iv3 + ", iv4 = " + iv4);
		
		System.out.println("iv3 == iv4" + ( iv3 == iv4));
		
		System.out.println("iv3.equals(iv4):" + iv3.equals(iv4));}
}
