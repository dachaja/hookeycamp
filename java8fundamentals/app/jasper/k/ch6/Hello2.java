package jasper.k.ch6;

public class Hello2 {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 3;
		int n3 = add(n1 , n2);
		
		System.out.println(n3);
//		System.out.println(add(n1,n2));
	}
	
	// adding method
	static int add(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;
	}
	int add(int n1, short n2) {
		int sum = n1 + n2;
		
		return sum;
	}
	public int add3(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;
	}
	
	void process(int n) {
		System.out.println();
	}
	double add(int n1, double d1) {
		double sum = n1 + d1;
		
		return sum;
	}
	double add(double d1, int n1) {
		double sum = d1+n1;
		
		return sum;
	}
}
