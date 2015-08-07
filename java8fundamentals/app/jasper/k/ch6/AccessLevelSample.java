package jasper.k.ch6;

public class AccessLevelSample {
	private int num1;	// private access level
	int num2;			// package-level access
	protected int num3; // protected access level
	public int num4;	// public access level
	
	public static int count = 1; // public access level
	
	// m1() method has private access level
	private void m1() {
		// Code goes here
	}
	// m2() method has package-level
	void m2() {
		
	}
	//m3() method has protected access level
	protected void m3() {
		// Code goes here
	}
	
	//m4() method has public access level
	public void m4() {
		// Code goes here
	}
	// doSomething() method has private access level
	private static void doSomething(){
		// Code goes here
	}
}
