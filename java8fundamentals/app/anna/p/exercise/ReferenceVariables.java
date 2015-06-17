package anna.p.exercise;

public class ReferenceVariables {
	
	public static void main(String[] args) {
		String str1;
		String str2;
		
		str1 = new String("Hello");
		System.out.println("str1: " + str1);
//		System.out.println("str2: " + str2);
		str2 = str1;
		System.out.println("str2: " + str2);
		
		str2 = null;
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		
		str2 = "Hello2";
		System.out.println("str2: " + str2);
		System.out.println("str1: " + str1);
		
		int num = 0x12cf;
		
		
	}
	
}
