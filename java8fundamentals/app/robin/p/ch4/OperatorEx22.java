package robin.p.ch4;

public class OperatorEx22 {
	public static void main(String[] args) {
		int temp;
		
		System.out.println(-8);
		// Convert -8 to binary string
		System.out.println(Integer.toBinaryString(-8));
		System.out.println();
		
		temp = -8 << 1;
		System.out.println("-8 << 1 = " + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
		
		temp = -8 << 2;
		System.out.println("-8 << 2 =" + temp);
		System.out.println(Integer.toBinaryString(temp));
		System.out.println();
	}

}
