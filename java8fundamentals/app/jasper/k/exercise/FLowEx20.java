package jasper.k.exercise;

public class FLowEx20 {
	public static void main(String[] args) {
		System.out.println("Start count down");
		for (int i = 10; i >= 0; i--) {
			//for (int j = 0; j < 1000000000; j++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//}
			System.out.println(i);
		}
		System.out.println("Game over");
	}
}
