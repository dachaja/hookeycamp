package anna.p.homework.ch3;

public class Exercise3_9 {
	public static void main(String[] args) {
		char ch = 'A';
		boolean b = ((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)  ? true : false);
		
		System.out.println(b);
	}
}
