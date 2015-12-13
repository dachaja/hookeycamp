package robin.p.ch3;

public class DataTypeExamples {

	public static void main(String[] args) {
		//  -128 to 127
		byte b1 = 125;
		byte b2 = -11;
		int b3 = 150;
		
		int num1 = 15;
		byte b4 = 15;
		
		b4 = (byte) num1;
		num1 = b4;
		
		byte max = Byte.MAX_VALUE;
		byte min = Byte.MIN_VALUE;
		
		// -32768 to 32767
		int s1 = 12905;
		short s2 = -11890;
		// short > byte
		short s3 = 15;
		byte b5 = 10;
		s1 = b1;
		
		// int > short
		short num2 = 10;
		s1 = num2;
		s1 = 35000;
				
		short s_max = Short.MAX_VALUE;
		short s_min = Short.MIN_VALUE;
		 
		//Decimal number format
		int i1 = 17;
		//Octal number format
		int i2 = 021;
		//Hexadecimal number format
		int i3 = 0x12cf;
		//Binary number format
		int i4 = 0b10101; // starting with 0b or 0B.
		
		int i_max = Integer.MAX_VALUE;
		int i_min = Integer.MIN_VALUE;
		
		long numl1 = 0L; // L or l
		long numl2 = 401L;
		long num13 = -3556L;
		long num14 = 89898L;
		long num15 = -105L;
		long num16 = 25L; // int numi6 = 25;
		
		char c1 = 'A';
		String s11 = "A";
		String str2 = "abcedfg";
		char c2 = 'L';
		char c3 = '5';
		char c4 = '/';
		
		char c5 = 'a';
		char c6 = 'b';
		char c7 = '\u0041';
		
		boolean notDone = false;  //0
		boolean done = true;  //1

		float f1 = 8F;  // f or F
		float whatisit = 8.F;
		whatisit = 8.0F;
		float f4 = 3.51F;
		float f5 = 0.0F;
		float f6 = 16.78f;
		float binNum = Float.MAX_VALUE;
		float justAChar = 'A';
		
		double d1 = 8D;
		double d2 = 8.;
		double d3 = 8.0;
		double d4 = 8.D;
		double d5 = 78.9867;
		double d6 = 45.0;
		
		double d7 = 32.5E-1;
		double d8 = 0.325E1;
		double d9 = 0.3255D;
		
		//1969.
		int x1 = 1_969;
		int x2 = 1__969;
		int x3 = 19_69;
		int x4 = 196_9;
		
		String str = "196_9";
	}

}
