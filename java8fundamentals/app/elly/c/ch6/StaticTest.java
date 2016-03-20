package elly.c.ch6;

public class StaticTest {
	static int width = 100; // class variable
	static int height = 120; // class variable
	
	static { //class block
		
	}
	static int max(int a, int b) { // class method (static method)
		return a> b ? a : b;
	}
}
