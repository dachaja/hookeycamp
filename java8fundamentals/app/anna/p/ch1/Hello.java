package anna.p.ch1;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, world.");
		System.out.println(args[0] +args[1]);
		if(true) {
			System.out.println("Hello, world.");
			if(false) {
				System.out.println("Hello, world.");
				System.out.println("Hello, world.");
				System.out.println("Hello, world.");
			}
		}
}
}
