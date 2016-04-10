package anna.p.ch6;

public class StaticBlockTest {
	static int[] arr = new int[10];
	
	static {
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		System.out.println(args.length);
		for(int i=0; i < args.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
	}
}
