package anna.p.exercise.ch11;

public class StringEquals {
	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hi");
		String str3 = new String("Hello");
		
		boolean b1, b2;
		
		b1 = str1.equals(str2); // false will be assigned to b1
		b2 = str1.equals(str3); // true will be assigned to b2
		
		b1 = str1.equals("Hello"); //true will be assigned to b1
		b2 = "Hello".equals(str1); // true will be assigned to b2
		b1 = "Hello".equals("Hi"); // false will be assigned to b1
		
	}
}
