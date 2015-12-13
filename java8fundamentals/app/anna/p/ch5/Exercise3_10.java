package anna.p.ch5;

public class Exercise3_10 {
	public static void main(String[] args) {
		char ch = 'G';
		
		char lowerCase = (char) ((ch >= 65 && ch <= 90) ? (ch+32) : ch);
		//char lowerCase2 = ('A' <= ch ? (char)(ch+32) : ch);
		System.out.println("upperCase: " + ch);
		System.out.println("lowerCase: " + lowerCase);
	}
}
