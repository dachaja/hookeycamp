package jasper.k.p2;

import static jasper.k.p1.A.test;

public class Test {

	public static void main(String[] args) {
		jasper.k.p1.A.test();	
		
	}
	public static void test(){
		System.out.println("p2.Test.test()");
	}
	// adding method
	static int add(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;
	}
	
}
