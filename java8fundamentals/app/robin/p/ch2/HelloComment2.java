package robin.p.ch2;

public class HelloComment2 {
	public static void main(String[] args) {
		System.out.println("Hello, /*this is not a comment.*/ world."); //" "에 있는 문장은 코멘트와 상관없이 나옴
		System.out.println("Hello, world. //this is not a comment too.");
	}
}
