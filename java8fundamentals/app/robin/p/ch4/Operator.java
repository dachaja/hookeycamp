package robin.p.ch4;

public class Operator {
	public static void main(String[] args) {
		int b1;
		byte b4;
		byte b2 = 2;
		byte b3 = 3;
		b1 = b2 + b3;
		b4 = (byte)(b2 + b3);
		
		b4 = 3 + 2;
		b4 = (byte) (127 + 10);
		
		System.out.println(b4);
		
		double b11 = 2;
		byte b22 = 3;
		short s1 = 1000;
		int i = 10;
		int j = 10;
		float f1 = 2.5F;
		double d1 = 20.0;
		
		b11 = i + 5;
		b11 = s1 + 2;
		b11 = f1 + b2;
		b11 = f1 + d1;
		
		
}

}
