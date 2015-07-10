package anna.p.exercise;

public class StatementSumXY {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = sum(x,y);
		System.out.println("z= " + z);
	}
	private static int sum(int x, int y) {
		int z = x + y;
		return z;
	}
}
