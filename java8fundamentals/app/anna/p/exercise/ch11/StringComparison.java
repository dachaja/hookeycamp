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
		
		String str = "HELLO";
		
		// Get the length of string
		int len = str.length();
		
		// Loop through all characters and print their indexes.
		for (int i=0; i < len; i++) {
			System.out.println(str.charAt(i) + " has index " + i);
		}
		
		String str1 = "Hello";
		String str2 = "HELLO";
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("Ignoring case str1 and str2 are equal.");
		} else {
			System.out.println("Ignoring case str1 and str2 are not equal.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1 and str2 are equal.");
		} else {
			System.out.println("str1 and str2 are not equal.");
		}
		
		String str3 = "Hello";
		String str4 = "";
		String str5 = null;
		
		// Using the isEmpty() method
		boolean empty1 = str3.isEmpty(); // false
		boolean empty2 = str4.isEmpty(); // true
		
		// Using the equals() method
		boolean empty3 = "".equals(str5); // false
		boolean empty4 = "".equals(str4); //true
		
		// Comparing length of the string with 0
		boolean empty5 = str3.length() == 0; // false
		boolean empty6 = str4.length() == 0; // true
		
		String str6 = new String("Hello");
		System.out.println(str6.toUpperCase());
		System.out.println(str6.toLowerCase());
		
		String str7 = new String("Apple");
		
		int index;
		index = str7.indexOf('p'); // 1
		index = str7.indexOf("pl"); // 2
		index = str7.lastIndexOf('p'); // 2
		index = str7.lastIndexOf("pl"); // 2
		index = str7.indexOf("k"); // -1
		
		String s1 = String.valueOf('C');
		String s2 = String.valueOf("10");
		String s3 = String.valueOf(true);
		String s4 = String.valueOf(1969);
		
		String s5 = "Hello".substring(1);
		String s6 = "Hello".substring(1, 4);
	}
}
