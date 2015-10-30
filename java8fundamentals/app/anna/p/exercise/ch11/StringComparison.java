package anna.p.exercise.ch11;

public class StringComparison {
	public static void main(String[] args) {
		String apple = new String("Apple");
		String orange = new String("Orange");
		
		System.out.println(apple.equals(orange)); // false
		System.out.println(apple.equals(apple)); // true
		System.out.println(apple == apple); // true
		System.out.println(apple == orange); // false
		System.out.println(apple.compareTo(apple)); // 0
		System.out.println(apple.compareTo(orange)); // -14
	}
}
