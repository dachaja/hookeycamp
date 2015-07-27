// DefaultInit.java
package david.l.exercise.ch6;

class DefaultInit {
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		boolean bool;
		String str;
		
		public static void main(String[] args){
			// Create an object of DefaultInit class
			DefaultInit obj = new DefaultInit();
			
			// Print the default values for all instance variables
			System.out.println("byte is initialized to " + obj.b);
			System.out.println("short is initialized to " + obj.s);
			System.out.println("int is initialized to " + obj.i);
			System.out.println("long is initialized to " + obj.l);
			System.out.println("float is initialized to " + obj.f);
			System.out.println("byte is initialized to " + obj.b);


	}

}
