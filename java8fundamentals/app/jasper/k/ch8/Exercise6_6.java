package jasper.k.ch8;

public class Exercise6_6 {
	static double getDistance(int x, int y, int x1, int y1){
		double xResult = Math.pow(x-x1, 2);
		double yResult = Math.pow(y-y1, 2);
		double Result = Math.sqrt(xResult + yResult);
		return Result;
	}
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}
}
