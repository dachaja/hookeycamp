package anna.p.homework;

public class FlowEx20 {
	public static void main(String[] args) {
		System.out.println("Start count down");
		for (int i = 10; i >= 0; i--) {
			for (int j = 0; j < 1000000000; j++) {
				;
			}
			System.out.println(i);
		}
		System.out.println("Game over");
	}
}
