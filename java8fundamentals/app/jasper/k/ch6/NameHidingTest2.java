package jasper.k.ch6;

public class NameHidingTest2 {
	static int n1 = 10;
	
	void m1(){
		int n1 = 20;
		int n2=n1;
	}
	int n3 = n1;
}
