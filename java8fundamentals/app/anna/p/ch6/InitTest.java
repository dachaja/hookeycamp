package anna.p.ch6;

public class InitTest {
	int x = 0; //
	int y = x;
	static int z = 0; // class variable
	
	void method1() {
		int i = 0;
		int j = i;
		
		System.out.println(x);
	}
	
	void method2() {
		int i = 1;
		System.out.println(y);
		
		System.out.println(i);
		
		int y = 9;
		
		this.y = y;
	}
}
