package jasper.k.exercise;

public class SwitchStatement {
	public static void main(String[] args) {
		short b = 10;
		switch (b) {
			case 5:
				b++;
			case 150:
				b--;
			default:
				b = 0;
		}
	}
}
