package anna.p.ch4;

public class OperatorEx22 {
	public static void main(String[] args) {
		int temp;		// variable
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
//		System.out.println(false && false);
//		System.out.println(y >= 5);
//		System.out.println(x < 0);
//		System.out.println(x > 2);
		System.out.println(y >= 5 || x < 0);
		System.out.println(true && x>2);
		System.out.println(y >= 5 || (x < 0 && x > 2));
		
		System.out.println(-8);
		// Convert -8 to binary string
		System.out.println(Integer.toBinaryString(-8));
		System.out.println();
		
		temp = -8 << 1;
		System.out.println("-8 << 1 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8 << 2;
		System.out.println("-8 << 2 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
	}
}
