package anna.p.exercise.ch11;

public class StringPool {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "Hello";
		
		str2 = str2.intern();
	}
}
