package anna.p.exercise.ch6;

public class MathUtil {
	public static int max(int x, int y) {
		int max = x;
		if(y > max) {
			max = y;
		}
		return max;
	}
	
	public static int max(int x, int y, int z) {
		int max = x;
		if(y > max) {
			max = y;
		}
		if(z > max) {
			max = z;
		}
		return max;
	}
	
	public static int max(int[] num, String str) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i < num.length;i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		return max;
	}
	
	public static int max(int...num) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		return max;
	}
	
	public static int max2(int...num) {
		int max = Integer.MIN_VALUE;
		for(int currentNumber : num) {
			if(currentNumber > max) {
				max = currentNumber;
			}
		}
		return max;
	}
	
	public static int max(int n1, int n2, int... num) {
		// Initialize max to the maxium of n1 and n2
		int max = (n1 > n2 ? n1 : n2);
		
		for(int i=0; i < num.length; i++) {
			if(num[i] > max) {
				max= num[i];
			}
		}
		return max;
	}
	
	public static void main(String... args) {
		int max = MathUtil.max(12, 18);
		max = MathUtil.max(MathUtil.max(70, 9), 30);
		
		int[] num1 = new int[] {10, 1};
		int max1 = MathUtil.max(num1);
		
		int[] num2 = new int[] {10, 8, 18};
		int max2 = MathUtil.max(num2);
		
		System.out.println("max(7,9) = " + MathUtil.max(7, 9));
		System.out.println("max(70, 19, 30) = " + MathUtil.max(70, 19, 30));
		System.out.println("max(-7, -1, 3) = " + MathUtil.max(-70, -1, 3));
	}
}
