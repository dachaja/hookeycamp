package robin.p.ch4;

public class ArithOperator {
	public static void main(String[] args) {
		int num = 120;
		double realNum = 25.8 / 0.0;
		double veryBigNum = 25.8 / 0.0;
		double garbage = 0.0 / 0.0;
		boolean test = true;
		
		System.out.println("num =" + num); // num = 120
		
		System.out.println("realNum =" + realNum);
		
		System.out.println("veryBigNum =" + veryBigNum);
		
		System.out.println("garbage =" + garbage);
		
		System.out.println("test =" + test);
		
		System.out.println("Maximum int =" + Integer.MAX_VALUE);
		
		System.out.println("Maximum double =" + Double. MAX_VALUE);
		
		System.out.println("12.5 + 100 = "+ (12.5 +100)); // 112.5
		
		System.out.println("12.5 + 100 = "+ 12.5 + 100); // 12.5100
		// "12.5 + 100 = 12.5" + 100 --> "12.5+100 = 12.5100"
		
		System.out.println("12.5-100=" + (12.5 - 100));
		System.out.println("12.5*100=" + (12.5*100));
		System.out.println("12.5/100=" + (12.5 / 100));
		// System.out.println("12.5 - 100=" + 12.5 - 100);
		
		
		
			
		
		int x = 2;
		int y = 5;
		char c='A';
		
		System.out.println(1+x<<33);
		System.out.println(y>=5 || x<0 && x>2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println(!('A' <= c && c <='Z'));
		System.out.println('C' - c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
		
		}
		
	}

