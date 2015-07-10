package jasper.k.exercise;

public class IfElseEx3 {
	public static void main(String[] args) {
		int num = 1;
		int num2 = 50;
		int num3 = 10;
		if(num > 50) {
			if (num2<30) {
			} else {
				num3 -= 130;
			}
		} else { 
			num3 *=200;
		}
		System.out.println(" num = " + num);
		System.out.println(" num2 = " + num2);
		System.out.println(" num3 = " + num3);
	}
}